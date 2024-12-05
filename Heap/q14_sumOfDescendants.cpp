


double Heap::sumOfDescendants(int index) {
    if (index >= count) {
        return 0.0; // No descendants for out-of-range index
    }

    double sum = 0.0;
    int leftChild = 2 * index + 1;
    int rightChild = 2 * index + 2;

    // Sum the left child and its descendants
    if (leftChild < count) {
        sum += array[leftChild].getData() + sumOfDescendants(leftChild);
    }

    // Sum the right child and its descendants
    if (rightChild < count) {
        sum += array[rightChild].getData() + sumOfDescendants(rightChild);
    }

    return sum;
}
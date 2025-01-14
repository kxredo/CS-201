Given the index of a heap node in a max-heap, write a recursive function
that returns the sum of all descendants of this node.
double sumOfDescendants(int index)


double Heap::sumOfDescendants(int index) {
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

double Heap::sumOfAscendants(int index) {

    int parent = (index - 1) / 2; // Calculate the parent's index

    // Add the parent's value and recursively sum its ascendants
    return array[parent].getData() + sumOfAscendants(parent);
}

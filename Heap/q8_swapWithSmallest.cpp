

void Heap::swapWithSmallest(int index) {
    int leftChild = 2 * index + 1;
    int rightChild = 2 * index + 2;
    int smallestChild = index;

    if (leftChild < count && array[leftChild].getData() < array[smallestChild].getData()) {
        smallestChild = leftChild;
    }

    if (rightChild < count && array[rightChild].getData() < array[smallestChild].getData()) {
        smallestChild = rightChild;
    }

    if (smallestChild != index) {
        swapNode(index, smallestChild);
    }
}
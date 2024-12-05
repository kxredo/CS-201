

bool heapOrder(int index, int* heap, int count) {
    int leftChild = 2 * index + 1;
    int rightChild = 2 * index + 2;

    // Check left child
    if (leftChild < count) {
        if (heap[index] < heap[leftChild] || !heapOrder(leftChild, heap, count)) {
            return false;
        }
    }

    // Check right child
    if (rightChild < count) {
        if (heap[index] < heap[rightChild] || !heapOrder(rightChild, heap, count)) {
            return false;
        }
    }

    return true;
}
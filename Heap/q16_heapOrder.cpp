Given the index of a heap node in a max-heap, write a method that
determines if the subtree rooted from the node with index satisfies the
heap-order property. Do not use any class or external methods.
boolan heapOrder(int index)

bool Heap::heapOrder(int index) {
    int left = 2 * index + 1;
    int right = 2 * index + 2;

// if leftChild is in heap size
// if index value < leftChild value
// return false
    if (left < count) {
        if (array[index].getData() < array[left].getData() || !heapOrder(left)) {
            return false;
        }
    }

    if (right < count) {
        if (array[index].getData() < array[right].getData() || !heapOrder(right)) {
            return false;
        }
    }

    return true;
}
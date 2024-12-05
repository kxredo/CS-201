

int Heap::maxGrandChild(int index) {
    int maxIndex = -1;
    int maxValue = INT_MIN;

    // Check all grandchildren
    for (int i = 0; i < 4; i++) {
        int grandChildIndex = 2 * (2 * index + 1) + i;
        if (grandChildIndex < count && array[grandChildIndex].getData() > maxValue) {
            maxValue = array[grandChildIndex].getData();
            maxIndex = grandChildIndex;
        }
    }

    return maxIndex;
}
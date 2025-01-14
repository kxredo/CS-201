


int kthMaximum(int array[], int N, int k) {
    MinHeap minHeap;

    for (int i = 0; i < N; ++i) {
        if (minHeap.size() < k) {
            minHeap.insert(array[i]);
        } else if (array[i] > minHeap.getMin()) {
            minHeap.extractMin();
            minHeap.insert(array[i]);
        }
    }

    return minHeap.getMin();
}

/*
Given an array of N integers, find the k’th maximum of those integers
 in O(N logK) time. (Hint: Use a min-heap to store K largest elements
 at a time, in that case the removeMin will return the k’th maximum).
 int kthMaximum(int[] array, int k)
 */

public static int kthMaximum(int[] array, int k) {
    MinHeap minHeap = new MinHeap(k);
    
    for (int i = 0; i < k; i++) {
        minHeap.insert(new HeapNode(array[i], i));
    }
    
    for (int i = k; i < array.length; i++) {
        if (array[i] > minHeap.array[0].getData()) {
            minHeap.delete();
            minHeap.insert(new HeapNode(array[i], i));
        }
    }
    return minHeap.array[0].getData();
}

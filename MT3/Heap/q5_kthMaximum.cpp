

HeapNode Heap::kthMaximum(int k) {
    
    // Create a copy of the heap to preserve the original heap
    Heap tempHeap(*this);

    HeapNode kthMax;
    for (int i = 0; i < k; ++i) {
        kthMax = tempHeap.deleteTop();
    }

    return kthMax;
}
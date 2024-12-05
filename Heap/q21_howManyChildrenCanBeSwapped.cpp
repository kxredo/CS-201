Write the method in MinHeap class
 int howManyChildrenCanBeSwapped()
 that returns the number of nodes in the heap whose children can be
 swapped without hurting the heap property. Your method should run
 in O(N) time.


int MinHeap::howManyChildrenCanBeSwapped() {
    int count = 0;
    for (int i = 0; i < this->count; ++i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < this->count && right < this->count) {
            if (array[i].getData() <= array[left].getData() && array[i].getData() <= array[right].getData()) {
                count++;
            }
        }
    }
    return count;
}


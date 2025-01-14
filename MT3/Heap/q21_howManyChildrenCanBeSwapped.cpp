Write the method in MinHeap class
 int howManyChildrenCanBeSwapped()
 that returns the number of nodes in the heap whose children can be
 swapped without hurting the heap property. Your method should run
 in O(N) time.


int MinHeap::howManyChildrenCanBeSwapped() {
    int swappableNodes = 0;
    for (int i = 0; i < size; ++i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if(left < size && right < size){
            bool found = true;
            
            int leftLeft = 2*left + 1;
            if(leftLeft < size && array[leftLeft].getData() < array[right].getData()){
                found = false;
            }
            int leftRight = 2*left+2;
            if(leftRight < size && array[leftRight].getData() < array[right].getData()){
                found = false;
            }
            int rightLeft = 2*right + 1;
            if(rightLeft < size && array[rightLeft].getData() < array[left].getData()){
                found = false;
            }
            
            int rightRight = 2*right + 2;
            if(rightRight < size && array[rightRight].getData() < array[left].getData()){
                found = false;
            }
            if(found){
                swappableNodes++;
            }
            
        }
    }
    return swappableNodes;
}


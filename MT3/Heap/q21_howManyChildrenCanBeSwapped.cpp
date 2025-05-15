/*
Write the method in MinHeap class
 int howManyChildrenCanBeSwapped()
 that returns the number of nodes in the heap whose children can be
 swapped without hurting the heap property. Your method should run
 in O(N) time.
*/

public int howManyChildrenCanBeSwapped() {
    int count = 0;
    
    // Iterate through all potential parent nodes
    for (int i = 0; i < count; i++) {
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;
        
        // Check if the node has two children
        if (rightChild < count) {
            if (array[i].getData() <= array[leftChild].getData() && 
                array[i].getData() <= array[rightChild].getData()) {
                count++;
            }
        }
    }
    
    return count;
}


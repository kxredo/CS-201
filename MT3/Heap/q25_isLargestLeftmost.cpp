/*
Write the method in MinHeap class
 bool isLargestLeftMost()
 which returns true if the largest value appears on the leftmost node.
 You may not use any additional data structures.
 bool MinHeap::isLargestLeftMost(){
*/
    MinHeap::bool isLargestLeftMost() {
        
        int leftChild = 2 * index + 1;        
        int leftMostValue = array[leftChild].getData();
    
=        for (int i = 1; i < count; i++) {
            if (array[i].getData() > leftMostValue) {
                return false; // Found a larger value
            }
        }
            return true;
    }
    
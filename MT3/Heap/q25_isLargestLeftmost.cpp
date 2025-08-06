/*
Write the method in MinHeap class
 bool isLargestLeftMost()
 which returns true if the largest value appears on the leftmost node.
 You may not use any additional data structures.
 bool MinHeap::isLargestLeftMost(){
*/
bool MinHeap::isLargestLeftMost()
{
    
    int maxValue = array[0].getData();
    for (int i = 1; i < count; i++) {
        if (array[i].getData() > maxValue) {
            maxValue = array[i].getData();
        }
    }
    
    for (int i = 0; i < count; i++) {
        if (array[i].getData() == maxValue) {
            for (int j = 0; j < i; j++) {
                if (array[j].getData() == maxValue) {
                    return false; // Found the max value at an earlier position
                }
            }
            return true; // This is the leftmost occurrence
        }
    }
    
    return false;
}

bool MinHeap::isLargestRightmost()
{
    
    int maxValue = array[0].getData();
    for (int i = 1; i < count; i++) {
        if (array[i].getData() > maxValue) {
            maxValue = array[i].getData();
        }
    }
    for (int i = count - 1; i >= 0; i--) {
        if (array[i].getData() == maxValue) {
            for (int j = i + 1; j < count; j++) {
                if (array[j].getData() == maxValue) {
                    return false; // Found the max value at a later position
                }
            }
            return true; // This is the rightmost occurrence
        }
    }
    
    return false;
}

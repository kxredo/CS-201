/*
 Given the index of a heap node in a binary max heap, write the method
 in MaxHeap class that returns the indexes of its ascendants (parent, grandparent, grand
grandparent, ...) of this node. The array should contain only that
 many items not more not less.
 int∗ 
ascendants(int index)*/

int* MaxHeap::ascendants(int index) {
    // Calculate the number of ascendants
    int count = 0;
    int temp = index;
    
    while (temp > 0) {
        temp = (temp - 1) / 2; // get parent index
        count++;
    }
    int* result = new int[count];
    temp = index;
    int i = 0;
    while (i < count) {
        temp = (temp - 1) / 2; // get parent index
        result[i] = temp;
        i++;
    }
    return result;
}



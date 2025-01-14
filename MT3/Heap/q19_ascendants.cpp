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
        temp = (temp - 1) / 2;
        count++;
    }

    // Allocate memory for the ascendants array
    int* result = new int[count];

    // Fill the ascendants array
    temp = index;
    count = 0;
    while(temp>0)
        temp = (temp - 1) / 2;
        result[i] = temp;
    }

    return result;
}
Given the index of a set, write a function that returns the ancestors
 (itself, parent, grandparent, etc.).
 int∗ 
ascendants(int index)
 The size of the returning array should be as much as needed.

 int* DisjointSet::ascendants(int index, int& ascSize) {
    int* ascendantsArray = new int[count];
    ascSize = 0;

    int parent = index;
    do {
        ascendantsArray[ascSize++] = parent;
        parent = sets[parent].getParent();
    } while (parent != ascendantsArray[ascSize - 1]);

    // Resize the array to the exact number of ascendants
    int* result = new int[ascSize];
    for (int i = 0; i < ascSize; ++i) {
        result[i] = ascendantsArray[i];
    }

    return result;
}
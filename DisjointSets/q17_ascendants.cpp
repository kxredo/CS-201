Given the index of a set, write a function that returns the ancestors
 (itself, parent, grandparent, etc.).
 int∗ 
ascendants(int index)
 The size of the returning array should be as much as needed.

int* DisjointSet::ascendants(int index) {
    int* ancestors = new int[count];
    int size = 0;

    while (true) {
        ancestors[size++] = index;
        int parent = sets[index].getParent();
        if (parent == index) {
            break;
        }
        index = parent;
    }

    int* result = new int[size];
    for (int i = 0; i < size; ++i) {
        result[i] = ancestors[i];
    }

    delete[] ancestors;
    return result;
}
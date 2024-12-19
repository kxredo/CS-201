Write the method in DisjointSet class
 int∗ getSetWithIndex(int index)
 which returns the indexes of all sets in the disjointset where a set with
 index index is in that set.

int* DisjointSet::getSetWithIndex(int index, int& setSize) {
    int root = findSetIterative(index);
    // First, count the number of elements in the set
    setSize = 0;
    for (int i = 0; i < count; ++i) {
        if (findSetIterative(i) == root) {
            setSize++;
        }
    }

    // Allocate memory for the result array
    int* result = new int[setSize];
    int j = 0;
    for (int i = 0; i < count; ++i) {
        if (findSetIterative(i) == root) {
            result[j++] = i;
        }
    }

    return result;
}
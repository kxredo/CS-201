Write the method in DisjointSet class
 int∗ getSetWithIndex(int index)
 which returns the indexes of all sets in the disjointset where a set with
 index index is in that set.

int* DisjointSet::getSetWithIndex(int index, int& setSize) {
    int setSize = 0;
    for(int i = 0; i < count; i++) {
        if(findSetIterative(index) == findSetIterative(i)){
            setSize++;
        }
    }

    int* result = new int[setSize];

    setSize = 0;
    for(int i = 0;i < count; i++){
        if(findSetIterative(index) == findSetIterative(i)){
            result[setSize] = i;
            setSize++;
        }
    }

    return result;
}
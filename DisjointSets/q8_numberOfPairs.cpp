Write a function that calculates the number of pair disjoint sets in a
 disjoint set structure. A disjoint set is pair, if the number of sets in
 that disjoint set is 2.
 int numberOfPairs()

int DisjointSet::countPairDisjointSets() {
    int pairCount = 0;
    int* setSizes = new int[count]();

    for (int i = 0; i < count; ++i) {
        int root = findSetIterative(i);
        setSizes[root]++;
    }

    for (int i = 0; i < count; ++i) {
        if (setSizes[i] == 2) {
            pairCount++;
        }
    }

    delete[] setSizes;
    return pairCount;
}
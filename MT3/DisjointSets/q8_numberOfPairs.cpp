Write a function that calculates the number of pair disjoint sets in a
 disjoint set structure. A disjoint set is pair, if the number of sets in
 that disjoint set is 2.
 int numberOfPairs()

 // We wanna count so int pairCount
 // int setSizes[count]()
 // iterate through the sets array
 // find the root of the current set
 // increment the setSizes[root]
 // iterate through the setSizes array
 // if the current setSize is 2, increment the pairCount
 // return the pairCount
int DisjointSet::numberOfPairs() {
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
    return pairCount;
}
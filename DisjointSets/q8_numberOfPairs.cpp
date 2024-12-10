Write a function that calculates the number of pair disjoint sets in a
 disjoint set structure. A disjoint set is pair, if the number of sets in
 that disjoint set is 2.
 int numberOfPairs()

int DisjointSet::numberOfPairs() {
    int countPairs = 0;
    for (int i = 0; i < this->count; ++i) {
        if (sets[i].getParent() == i) {
            int childCount = 0;
            for (int j = 0; j < this->count; ++j) {
                if (i != j && sets[j].getParent() == i) {
                    childCount++;
                }
            }
            if (childCount == 1) { // If there's exactly one child, it forms a pair (2 elements)
                countPairs++;
            }
        }
    }
    return countPairs;
}
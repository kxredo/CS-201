/*
Write a function that computes the number of disjoint sets in a disjoint set structure.
int numberOfSets()
 */
int DisjointSet::numberOfSets() {
    int setCount = 0;
    for (int i = 0; i < count; ++i) {
        if (sets[i].getParent() == i) {
            ++setCount;
        }
    }
    return setCount;
}
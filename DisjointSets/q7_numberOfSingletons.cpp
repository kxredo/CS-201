Write a function that calculates the number of singleton disjoint sets
 in a disjoint set structure. A disjoint set is singleton, if the number of
 sets in that disjoint set is 1.
 int numberOfSingletons()

 int DisjointSet::numberOfSingletons() {
    int countSingletons = 0;
    for (int i = 0; i < this->count; ++i) {
        if (sets[i].getParent() == i) {
            bool isSingleton = true;
            for (int j = 0; j < this->count; ++j) {
                if (i != j && sets[j].getParent() == i) {
                    isSingleton = false;
                    break;
                }
            }
            if (isSingleton) {
                countSingletons++;
            }
        }
    }
    return countSingletons;
}
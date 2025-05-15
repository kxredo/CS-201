Write a function that calculates the number of singleton disjoint sets
 in a disjoint set structure. 
 A disjoint set is singleton, if the number of sets in that disjoint set is 1.
 int numberOfSingletons()

 // We wanna count so int countSingle
 // Iterate through the sets array
 // If the parent of the current set is equal to the index, it's a root set
 // Check if the current set is a singleton by iterating through the sets array again
 // If the parent of any other set is equal to the index, it's not a singleton
 // If the current set is a singleton, increment the count of singletons
 // Return the count of singletons

 int DisjointSet::numberOfSingletons() {
    int countSingletons = 0;
    
    for (int i = 0; i < count; ++i) {
        if (sets[i].getParent() == i) {
            bool isSingleton = true;
            for (int j = 0; j < count; ++j) {
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
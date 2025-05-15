Write the method in DisjointSet class
 int numberOfTriplets()
 that calculates the number of triplet disjoint sets in a disjoint set struc
ture. A disjoint set is a triplet, if the number of sets in that disjoint
 set is 3. Do not use any class or external methods.

public int numberOfTriplets() {
    int[] setCounts = new int[count];

    for (int i = 0; i < count; i++) {
        int root = findSetIterative(i);
        setCounts[root]++;
    }
    int tripletCount = 0;
    for (int i = 0; i < count; i++) {
        if (setCounts[i] == 3) {
            tripletCount++;
        }
    }
    return tripletCount;
}
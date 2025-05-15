You are given a set of equalities such as
 0=9
 1=2
 3=5
 5=7
 9=4
 5=4
 6=8
 where numbers correspond to variables. When the equalities are combined,we get
 0=9=4=3=5=7
 1=2
 6=8
 3 equalities. 
 Write the function that finds the number of equalities
 when combined where N represents the number of variables, left 
 and right represent the left and right parts of the equalities.
 int combine(intN, int[] left, int[] right)


int DisjointSet::combine(int N, int* left, int* right) {
    DisjointSet ds(N);

    for (int i = 0; i < N; ++i) {
        ds.unionOfSets(left[i], right[i]);
    }

    int* rootCount = new int[N]();
    
    for (int i = 0; i < N; ++i) {
        int root = ds.findSetIterative(i);
        rootCount[root]++;
    }

    int equalityCount = 0;
    for (int i = 0; i < N; ++i) {
        if (rootCount[i] > 0) {
            equalityCount++;
        }
    }

    delete[] rootCount;
    return equalityCount;
}
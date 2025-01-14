Youaregivenasetofequalitiessuchas
 0=9
 1=2
 3=5
 5=7
 9=4
 5=4
 6=8
 wherenumberscorrespondtovariables.Whentheequalitiesarecom
bined,weget
 0=9=4=3=5=7
 1=2
 6=8
 3equalities. Write the functionthatfinds thenumber of equalities
 whencombinedwhereNrepresents thenumberofvariables, leftand
 rightrepresenttheleftandrightpartsoftheequalities.
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
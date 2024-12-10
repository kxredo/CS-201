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


int combine(int N, int[] left, int[] right) {
    // Union-Find parent array
    int[] parent = new int[N];
    for (int i = 0; i < N; i++) {
        parent[i] = i; // Initialize each variable as its own parent
    }

    // Find the representative of the set
    int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]); // Path compression
        }
        return parent[x];
    }

    // Union two sets
    void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) {
            parent[rootX] = rootY; // Merge sets
        }
    }

    // Process all equalities
    for (int i = 0; i < left.length; i++) {
        union(left[i], right[i]);
    }

    // Count unique components
    int count = 0;
    for (int i = 0; i < N; i++) {
        if (find(i) == i) {
            count++;
        }
    }

    return count;
}

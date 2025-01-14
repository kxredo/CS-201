Write the method in DisjointSet class
 void unionOfSets(int∗ 
indexList , int N)
 that merges N sets given their indexes in the indexList. You should
 use findSet and the original unionOfSets method. Merge the sets such
 that the resulting merged set will have the minimum depth. Use an
 algorithm that sorts the sets according to their depths.

#include <algorithm> // For std::sort

struct SetDepth {
    int index;
    int depth;
};

void DisjointSet::unionOfSets(int* indexList, int N) {
    // Create an array of SetDepth to store indexes and their depths
    int* depth = new int[N];
    for(int i = 0; i < N; i++){
        int set = findSetIterative(indexList[i]);
        depths[i] = sets[set].getDepth();
    }

    for(int i = 0;i < N; i++) {
        for(int j = 0; j<N;j++) {
            if(depths[i] < depths[j]) {
                int tmp = depths[j]{
                    depths[i] = depths[j];
                    depths[j] = tmp;
                    tmp = indexList[i];
                    indexList[i] = indexList[j];
                    indexList[j] = tmp;
                }
            }
        }
        for(int i = 0; i < N - 1; i++){
            unionOfSets(indexList[i], indexList[i + 1]);
        }
        delete[] depths;
    }
}
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
    SetDepth* setDepths = new SetDepth[N];
    
    // Fill the setDepths array with the indexes and their depths
    for (int i = 0; i < N; ++i) {
        int index = findSetIterative(indexList[i]);
        setDepths[i].index = index;
        setDepths[i].depth = sets[index].getDepth();
    }

    // Sort the setDepths array based on the depths
    std::sort(setDepths, setDepths + N, [](const SetDepth& a, const SetDepth& b) {
        return a.depth < b.depth;
    });

    // Merge the sets in the order of their depths
    for (int i = 1; i < N; ++i) {
        unionOfSets(setDepths[0].index, setDepths[i].index);
    }

    // Clean up the memory
    delete[] setDepths;
}
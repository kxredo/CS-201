Write a function that merges three sets given their indexes. You can
 use findSet method, but not the original union method. Merge the
 sets such that the resulting merged set will have the minimum depth.
 Update also the depth if needed.
 void union(int index1, int index2, int index3)

 void DisjointSet::union(int index1, int index2, int index3) {
    int set1 = findSetIterative(index1);
    int set2 = findSetIterative(index2);
    int set3 = findSetIterative(index3);

    // Find the set with the minimum depth
    int minDepthSet = set1;
    if (sets[set2].getDepth() < sets[minDepthSet].getDepth()) {
        minDepthSet = set2;
    }
    if (sets[set3].getDepth() < sets[minDepthSet].getDepth()) {
        minDepthSet = set3;
    }

    // Union set1 and set2 to minDepthSet
    if (minDepthSet != set1) {
        sets[set1].setParent(minDepthSet);
    }
    if (minDepthSet != set2) {
        sets[set2].setParent(minDepthSet);
    }

    // Union set3 to minDepthSet
    if (minDepthSet != set3) {
        sets[set3].setParent(minDepthSet);
    }

    // Update the depth if necessary
    if (sets[set1].getDepth() == sets[minDepthSet].getDepth() ||
        sets[set2].getDepth() == sets[minDepthSet].getDepth() ||
        sets[set3].getDepth() == sets[minDepthSet].getDepth()) {
        sets[minDepthSet].incrementDepth();
    }
}
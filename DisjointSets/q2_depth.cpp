
/*
2. Given the index of a set, write a function that finds the depth of that
 set. The depth of root node is 0, the depth of the node in the second
 level are 1, etc.
 int depth(int index)*/

 int DisjointSet::depth(int index) {
    return sets[index].getDepth();
}
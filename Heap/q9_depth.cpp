Given the index of a heap node, write a function that obtains the depth
of this node. The depth of root node is 0, the depth of the node in the
second level are 1, etc.
int depth(int index)

int depth(int index) {
    int depth = 0;
    while (index > 0) {
        index = (index - 1) / 2; // parent = (index-1)/2
        depth++;
    }
    return depth;
}
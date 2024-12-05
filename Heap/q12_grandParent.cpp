

int grandParent(int no) {
    if (no == 0) {
        return -1; // Root node has no grandparent
    }
    int parent = (no - 1) / 2;
    if (parent == 0) {
        return -1; // Parent is the root node, so no grandparent
    }
    return (parent - 1) / 2;
}
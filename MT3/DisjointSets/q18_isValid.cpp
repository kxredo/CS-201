Write a method
 bool isValid ()
 that returns true when the given disjoint set is valid, that is from every
 node n, when the ascendants are traversed, no circularity is observed
 (that is you do not encounter the node n again).

bool DisjointSet::isValid() {
    for (int i = 0; i < count; i++) {
        bool* visited = new bool[count]();
        int current = i;
        while (true) {
            if (visited[current]) {
                return false; // Detected circularity
            }
            visited[current] = true;
            int parent = sets[current].getParent();
            if (parent == current) {
                break; // Reached the root
            }
            current = parent;
        }
    }
    return true;
}
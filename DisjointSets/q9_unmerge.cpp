Given the index of a set S, write a method that unmerges (creates
 disjoint sets of) it. After unmerging, the direct children of S and S
 itself will be disjoint sets themselves. You don’t need to modify the
 depths. Do not use any class or external methods.
 void unmerge(int index)

void DisjointSet::unmerge(int index) {
    for (int i = 0; i < this->count; ++i) {
        if (sets[i].getParent() == index && i != index) {
            sets[i].setParent(i);
        }
    }
}
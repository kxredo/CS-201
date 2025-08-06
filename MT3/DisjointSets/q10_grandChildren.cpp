Given the index of a set, write a method that returns the indexes of
 its grandchildren as a linked list. Do not use any class or external
 methods.
 LinkedList grandChildren(int index)

 LinkedList DisjointSet::grandChildren(int index) {
    LinkedList grandChildrenList;
    for (int i = 0; i < count; ++i) { // find children of index
        if (sets[i].getParent() == index) {  // i is child if index
            for (int j = 0; j < count; ++j) { // find children of children
                if (sets[j].getParent() == i) {  // j is child of i
                    grandChildrenList.insertFirst(new Node(j));
                }
            }
        }
    }
    return grandChildrenList;
}


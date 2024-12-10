Given the index of a set, write a function that returns the indexes of
 children of that set.
 LinkedList getChildren(int index)

#include "LinkedList.h" // Assuming LinkedList is defined elsewhere

LinkedList DisjointSet::getChildren(int index) {
    LinkedList children;
    for (int i = 0; i < this->count; ++i) {
        if (i != index && sets[i].getParent() == index) {
            children.add(i);
        }
    }
    return children;
}
Write a function that returns the indexes of disjoint sets in a disjoint
 set structure.
 LinkedList getSets()

#include "LinkedList.h" // Assuming LinkedList is defined elsewhere

LinkedList DisjointSet::getSets() {
    LinkedList setsList;
    for (int i = 0; i < this->count; ++i) {
        if (sets[i].getParent() == i) {
            setsList.insertFirst(new Node(i));
        }
    }
    return setsList;
}



// without insertFirst
LinkedList DisjointSet::getSets() {
    LinkedList setsList;
    Node* lastNode = nullptr;

    for (int i = 0; i < this->count; ++i) {
        if (sets[i].getParent() == i) {
            Node* newNode = new Node(i);
            if (setsList.isEmpty()) {
                setsList.head = newNode;
                lastNode = newNode;
            } else {
                lastNode->setNext(newNode);
                lastNode = newNode;
            }
        }
    }

    return setsList;
}
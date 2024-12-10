Given the index of a set, write a method that returns the indexes of
 its grandchildrenas a linked list. Do not use any class or external
 methods.
 LinkedList grandChildren(int index)

 LinkedList DisjointSet::grandChildren(int index) {
    LinkedList grandChildrenList;
    for (int i = 0; i < this->count; ++i) {
        if (sets[i].getParent() == index) {
            for (int j = 0; j < this->count; ++j) {
                if (sets[j].getParent() == i) {
                    grandChildrenList.insertFirst(new Node(j));
                }
            }
        }
    }
    return grandChildrenList;
}


// Without insertFirst

LinkedList DisjointSet::grandChildren(int index) {
    LinkedList grandChildrenList;
    Node* lastNode = nullptr;

    for (int i = 0; i < this->count; ++i) {
        if (sets[i].getParent() == index) {
            for (int j = 0; j < this->count; ++j) {
                if (sets[j].getParent() == i) {
                    Node* newNode = new Node(j);
                    if (grandChildrenList.isEmpty()) {
                        grandChildrenList.head = newNode;
                        lastNode = newNode;
                    } else {
                        lastNode->setNext(newNode);
                        lastNode = newNode;
                    }
                }
            }
        }
    }

    return grandChildrenList;
}
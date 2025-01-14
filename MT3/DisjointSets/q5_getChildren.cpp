Given the index of a set, write a function that returns the indexes of
 children of that set.
 LinkedList getChildren(int index)


LinkedList DisjointSet::getChildren(int index) {
    LinkedList children;
    for (int i = 0; i < this->count; ++i) {
        if (i != index && sets[i].getParent() == index) {
            children.add(i);
        }
    }
    return children;
}


LinkedList DisjointSet::getChildren(int index) {
    LinkedList children;
    for (int i = 0; i < count; i++) {
        if (sets[i].getParent() == index && i != index) {
            Node* newNode = new Node(i);
            if (children.isEmpty()) {
                children.head = newNode;
                children.tail = newNode;
            } else {
                children.tail->setNext(newNode);
                children.tail = newNode;
            }
        }
    }
    return children;
}
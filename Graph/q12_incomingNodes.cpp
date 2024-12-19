

LinkedList GraphList::incomingNodes(int i) const {
    LinkedList incoming;
    for (int j = 0; j < vertexCount; j++) {
        for (const auto& neighbor : adjList[j]) {
            if (neighbor == i) {
                incoming.insertFirst(new Node(j));
                break;
            }
        }
    }
    return incoming;
}
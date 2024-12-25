Given the adjacency list representation of a graph G, find the incoming
 nodes to a given node i.
 LinkedList incomingNodes(int i)

LinkedList Graph::incomingNodes(int i) {
    LinkedList incoming = new LinkedList();
    for (int from = 0; from < vertexCount; ++from) {
        Edge* edge = edges[from].getHead();
        while (edge != nullptr) {
            if (edge->getTo() == i) {
                incoming->insert(from);
            }
            edge = edge->getNext();
        }
    }
    return incoming;
}
Given the adjacency list representation of a graph G, find the incoming
 nodes to a given node i.
 LinkedList incomingNodes(int i)

LinkedList Graph::incomingNodes(int i) {
    LinkedList incoming = new LinkedList();
    for (int j = 0; j < vertexCount; ++j) {
        Edge* edge = edges[j].getHead();
        while (edge != nullptr) {
            if (edge->getTo() == j) {
                incoming->insert(j);
            }
            edge = edge->getNext();
        }
    }
    return incoming;
}
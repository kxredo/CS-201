The reverse of a directed graph is another directed graph on the same
 vertex set, but with all edges reversed. Write a function that computes
 the reverse of a graph in adjacency list representation.
 Graph reverseGraph()

Graph Graph::reverseGraph() {
    Graph reversedGraph = new Graph(vertexCount);
    for (int i = 0; i < vertexCount; ++i) {
        Edge* edge = edges[i].getHead();
        while (edge != nullptr) {
            reversedGraph->addEdge(edge->getTo(), i, edge->getWeight());
            edge = edge->getNext();
        }
    }
    return reversedGraph;
}
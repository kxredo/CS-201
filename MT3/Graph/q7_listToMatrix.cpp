Write a function that converts a graph with adjacency list representa
tion to a graph with adjacency matrix representation.
 Graph listToMatrix()


Graph* Graph::listToMatrix() {
    Graph* matrixGraph = new array::Graph(vertexCount);
    for (int i = 0; i < vertexCount; ++i) {
        Edge* edge = edges[i].getHead();
        while (edge != nullptr) {
            matrixGraph->addEdge(i, edge->getTo(), edge->getWeight());
            edge = edge->getNext();
        }
    }
    return matrixGraph;
}
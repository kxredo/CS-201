Write the method in linked list implementation
Graph∗ inverseGraph()
which constructs an inverse graph of a given graph in linked list imple
mentation. In inverse graph, two distinct vertices are adjacent if and
only if they are not adjacent in the original graph. You are not allowed
to use extra data structures apart from the constructed graph.

Graph* Graph::inverseGraph() {
        Graph* inverse = new Graph(vertexCount);
    
        for (int i = 0; i < vertexCount; ++i) {
            for (int j = i + 1; j < vertexCount; ++j) {
                bool hasEdge = false;
                Edge* edge = edges[i].getHead();
                while(edge != nullptr) {
                    if(edge->getTo() == j) {
                        hasEdge = true;
                        break;
                    };
                    edge = edge->getNext();
                };
                if (!hasEdge) {
                    inverse->addEdge(i, j);
                }
            }
        }
        return inverse;
    };
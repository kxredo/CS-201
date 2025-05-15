Write the method in linked list implementation of Graph class
 Graph merge(const Graph& g2, int v)
 that returns a new graph formed by adding edges which exist in the
 original graph or g2. You may assume both graphs are weighted, if an
 edge exists in both graphs, add the resulting edge with the sum of their
 weights. You are not allowed to use any linked list methods.


    Graph Graph::merge(const Graph& g2, int v) {
        Graph result = new Graph(vertexCount);
        for (int i = 0; i < v; ++i) {
            Edge* edge = edges[i].getHead();
            while (edge != nullptr) {
                result.addEdge(i, edge->getTo(), edge->getWeight());
                edge = edge->getNext();
            }
        }
        for (int i = 0; i < v; ++i) {
            Edge* edge = g2.edges[i].getHead();
            while (edge != nullptr) {
                int from = i;
                int to = edge->getTo();
                int weight = edge->getWeight();
                Edge* existingEdge = result.edges[from].search(to);
                if (existingEdge != nullptr) {
                    existingEdge->setWeight(existingEdge->getWeight() + weight);
                } else {
                    result.addEdge(from, to, weight);
                }
                edge = edge->getNext();
            }
        }
        return result;
    }
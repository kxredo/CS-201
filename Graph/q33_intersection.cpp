Write the method in linkedlist implementation of Graph class
 Graph intersection(const Graph& g2, int v)
 that returns a new graph formed by adding edges which exist both
 in the original graph and g2. You may assume both graphs are unweighted.



namespace list {

    Graph Graph::intersection(const Graph& g2, int v) {
        Graph result(v);
        
        for (int i = 0; i < v; ++i) {
            Edge* edge = edges[i].getHead();
            while (edge != nullptr) {
                int to = edge->getTo();
                if (g2.edges[i].search(to) != nullptr) {
                    result.addEdge(i, to);
                }
                edge = edge->getNext();
            }
        }
        
        return result;
    }

}
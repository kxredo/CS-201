Write the method in linkedlist implementation of Graph class
 Graph intersection(const Graph& g2, int v)
 that returns a new graph formed by adding edges which exist both
 in the original graph and g2. You may assume both graphs are unweighted.


    Graph Graph::intersection(const Graph& g2, int v) {
        Graph result = new Graph(vertexCount);
        Edge n1 = edges[v].getHead();
        
        while(n1!=nullptr) {
            Edges n2 = g2.edges[v].getHead();
            while(n2!=nullptr) {
                if(n1.getTo() == n2.getTo()){
                    result.addEdge(v, n2.getTo());
                    n2 = n2.getNext();
                }
                n1 = n1.getNext();
            }
            return result;
        }
}
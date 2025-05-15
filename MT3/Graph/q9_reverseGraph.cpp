The reverse of a directed graph is another directed graph on the same
 vertex set, but with all edges reversed. Write a function that computes
 the reverse of a graph in adjacency matrix representation.
 Graph reverseGraph()

// Matrix
Graph Graph::reverseGraph() {
    Graph reversedGraph = new Graph(vertexCount);
    for (int i = 0; i < vertexCount; ++i) {
        for (int j = 0; j < vertexCount; ++j) {
            if (edges[i][j] != 0) { //edges[from][to]
                reversedGraph->addEdge(j, i, edges[i][j]); // addEge(from, to, weight)
            }
        }
    }
    return reversedGraph;
}

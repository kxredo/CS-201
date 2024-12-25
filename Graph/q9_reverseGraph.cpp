The reverse of a directed graph is another directed graph on the same
 vertex set, but with all edges reversed. Write a function that computes
 the reverse of a graph in adjacency matrix representation.
 Graph reverseGraph()

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


// Equivalent to this to make it make sense
Graph Graph::reverseGraph(){
    for (int i = 0; i < vertexCount; ++i) {
        for (int j = 0; j < vertexCount; ++j) {
            if(edges[i][j] == 0) {
                edges[i][j] = 1;
            }

            if(edges[i][j] == 1) {
                edges[i][j] = 0;
            }
        }
    }
    for (int i = 0; i < vertexCount; ++i) {
        for (int j = 0; j < vertexCount; ++j) {
            if(edges[j][i] == 0) {
                edges[j][i] = 1;
            }

            if(edges[j][i] == 1) {
                edges[j][i] = 0;
            }
        }
    }
}
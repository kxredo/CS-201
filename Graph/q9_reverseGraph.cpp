

Graph Graph::reverseGraph() const {
    Graph reversedGraph(vertexCount);
    for (int i = 0; i < vertexCount; i++) {
        for (int j = 0; j < vertexCount; j++) {
            if (edges[i][j] > 0) {
                reversedGraph.addEdge(j, i, edges[i][j]);
            }
        }
    }
    return reversedGraph;
}
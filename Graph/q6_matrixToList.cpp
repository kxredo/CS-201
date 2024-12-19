

list::Graph Graph::matrixToList() const {
    list::Graph listGraph(vertexCount);
    for (int i = 0; i < vertexCount; i++) {
        for (int j = 0; j < vertexCount; j++) {
            if (edges[i][j] > 0) {
                listGraph.addEdge(i, j, edges[i][j]);
            }
        }
    }
    return listGraph;
}
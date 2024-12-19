

array::Graph GraphList::listToMatrix() const {
    array::Graph matrixGraph(adjList.size());
    for (int i = 0; i < adjList.size(); i++) {
        for (const int& neighbor : adjList[i]) {
            matrixGraph.addEdge(i, neighbor);
        }
    }
    return matrixGraph;
}


Graph GraphList::reverseGraph() const {
    Graph reversedGraph(vertexCount);
    for (int i = 0; i < vertexCount; i++) {
        for (const auto& neighbor : adjList[i]) {
            reversedGraph.addEdge(neighbor, i);
        }
    }
    return reversedGraph;
}
Write the method in array implementation
 int numberOfCompleteSubGraphs()
 which returns the number of complete subgraphs in the graph. A com
plete graph is a graph, in which all vertices are connected to all vertices.
 Assume that the graph only consists of complete subgraphs of size > 1,
 there are no extra vertices, which is not in a complete subgraph. You
 are not allowed to use depth first search or breadth first search. In the
 graph below (1, 2, 5), (3, 6) and (4, 7) are complete subgraphs.


    int Graph::numberOfCompleteSubGraphs() {
        int subGraphCount = 0;
        bool* visited = new bool[vertexCount]();
        
        for (int i = 0; i < vertexCount; ++i) {
            if (!visited[i]) {
                subGraphCount++;
                for (int j = 0; j < vertexCount; ++j) {
                    if (edges[i][j] > 0) {
                        visited[j] = true;
                    }
                }
            }
        }
        delete[] visited;
        return subGraphCount;
    }

}
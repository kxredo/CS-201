A bipartite graph is a graph such that vertices of the graph can be
 partitioned into two subsets such that no edge has both its vertices
 in the same subset. Write a method for adjacency list representation
 which checks if the corresponding graph is bipartite or not. Hint: Use
 Depth or breath first search to traverse the graph.

bool isBipartite() {
    bool* visited = new bool[vertexCount];
    int* colors = new int[vertexCount];

    for (int i = 0; i < vertexCount; i++) {
        visited[i] = false;
        colors[i] = 0;
    }
    colors[0] = 1;
    visited[0] = true;
    
    depthFirstSearch(visited, 0);
    
    for (int i = 0; i < vertexCount; i++) {
        for (int j = 0; j < vertexCount; j++) {
            if (edges[i][j] > 0 && colors[i] == colors[j]) {
                return false;
            }
        }
    }
    return true;
}
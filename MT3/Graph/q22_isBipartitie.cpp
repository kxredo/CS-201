A bipartite graph is a graph such that vertices of the graph can be
 partitioned into two subsets such that no edge has both its vertices
 in the same subset. Write a method for adjacency list representation
 which checks if the corresponding graph is bipartite or not. Hint: Use
 Depth or breath first search to traverse the graph.

bool Graph::isBipartite() {
    if (vertexCount == 0) return true;
    
    bool* visited = new bool[vertexCount];
    int* colors = new int[vertexCount];
    
    // Initialize arrays
    for (int i = 0; i < vertexCount; i++) {
        visited[i] = false;
        colors[i] = 0;
    }
    
    // Color first vertex
    colors[0] = 1;
    visited[0] = true;
    
    // Use existing DFS to visit all nodes
    depthFirstSearch(visited, 0);
    
    // Check if any adjacent vertices have same color
    for (int i = 0; i < vertexCount; i++) {
        for (int j = 0; j < vertexCount; j++) {
            if (edges[i][j] > 0 && colors[i] == colors[j]) {
                delete[] visited;
                delete[] colors;
                return false;
            }
        }
    }
    
    delete[] visited;
    delete[] colors;
    return true;
}
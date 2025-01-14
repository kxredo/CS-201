A node in a graph is said to be an island if there are no incoming
 edges to it and no outgoing edges from it. Given the adjacency matrix
 representation of unweighted graph G, write a function that calculates
 the number of islands in that graph.
 int islands ()

int Graph::islands() {
    int count = 0;
    for (int i = 0; i < vertexCount; ++i) {
        bool isIsland = true;
        for (int j = 0; j < vertexCount; ++j) {
            if (edges[i][j] != 0 || edges[j][i] != 0) {
                isIsland = false;
                break;
            }
        }
        if (isIsland) {
            ++count;
        }
    }
    return count;
}
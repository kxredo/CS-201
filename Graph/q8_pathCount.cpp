

int** Graph::pathCount() {
    // Initialize path count matrix
    int** pathCounts = new int*[vertexCount];
    for (int i = 0; i < vertexCount; i++) {
        pathCounts[i] = new int[vertexCount];
        for (int j = 0; j < vertexCount; j++) {
            pathCounts[i][j] = edges[i][j];
        }
    }

    // Compute path counts using Floyd-Warshall algorithm
    for (int k = 0; k < vertexCount; k++) {
        for (int i = 0; i < vertexCount; i++) {
            for (int j = 0; j < vertexCount; j++) {
                if (pathCounts[i][k] && pathCounts[k][j]) {
                    pathCounts[i][j] += pathCounts[i][k] * pathCounts[k][j];
                }
            }
        }
    }

    return pathCounts;
}
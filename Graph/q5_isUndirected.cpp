

bool Graph::isUndirected() {
    for (int i = 0; i < vertexCount; i++) {
        for (int j = 0; j < vertexCount; j++) {
            if (edges[i][j] != edges[j][i]) {
                return false;
            }
        }
    }
    return true;
}
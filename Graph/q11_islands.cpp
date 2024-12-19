
int Graph::islands() const {
    int count = 0;
    for (int i = 0; i < vertexCount; i++) {
        bool isIsland = true;
        for (int j = 0; j < vertexCount; j++) {
            if (edges[i][j] != 0 || edges[j][i] != 0) {
                isIsland = false;
                break;
            }
        }
        if (isIsland) {
            count++;
        }
    }
    return count;
}
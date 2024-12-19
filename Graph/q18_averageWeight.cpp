

double GraphMatrix::averageWeight() const {
    int totalWeight = 0;
    int edgeCount = 0;
    for (int i = 0; i < vertexCount; i++) {
        for (int j = 0; j < vertexCount; j++) {
            if (edges[i][j] != 0) {
                totalWeight += edges[i][j];
                edgeCount++;
            }
        }
    }
    return edgeCount == 0 ? 0.0 : static_cast<double>(totalWeight) / edgeCount;
}
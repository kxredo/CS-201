
int GraphMatrix::numberOfSources() const {
    int count = 0;
    for (int i = 0; i < vertexCount; i++) {
        bool isSource = true;
        for (int j = 0; j < vertexCount; j++) {
            if (edges[j][i] != 0) {
                isSource = false;
                break;
            }
        }
        if (isSource) {
            count++;
        }
    }
    return count;
}
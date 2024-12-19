

int GraphMatrix::numberOfHubs() const {
    int count = 0;
    for (int i = 0; i < vertexCount; i++) {
        int incoming = 0;
        int outgoing = 0;
        for (int j = 0; j < vertexCount; j++) {
            if (edges[i][j] != 0) {
                outgoing++;
            }
            if (edges[j][i] != 0) {
                incoming++;
            }
        }
        if (incoming > outgoing) {
            count++;
        }
    }
    return count;
}
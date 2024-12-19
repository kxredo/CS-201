

namespace array{

    // Add this function
    int Graph::degree(int index) {
        int degree = 0;
        for (int i = 0; i < vertexCount; i++) {
            if (edges[index][i] > 0) { // Outgoing edge
                degree++;
            }
            if (edges[i][index] > 0) { // Incoming edge
                degree++;
            }
        }
        return degree;
    }

}
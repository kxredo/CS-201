Write a function that finds the median weight in a weighted graph.
 Write the function for adjacency matrix representation.
 int medianWeight()
 
int medianWeight() const {
    int weights[vertexCount * vertexCount]; // Assuming this is large enough
    int count = 0;

    for (int i = 0; i < vertexCount; ++i) {
        for (int j = 0; j < vertexCount; ++j) {
            if (edges[i][j] != 0) {
                weights[count++] = edges[i][j];
            }
        }
    }
    // Sort the weights array
    for (int i = 0; i < count - 1; ++i) {
        for (int j = 0; j < count - i - 1; ++j) {
            if (weights[j] > weights[j + 1]) {
                int temp = weights[j];
                weights[j] = weights[j + 1];
                weights[j + 1] = temp;
            }
        }
    }
    if (count % 2 == 0) {
        return (weights[count / 2 - 1] + weights[count / 2]) / 2;
    } else {
        return weights[count / 2];
    }
}
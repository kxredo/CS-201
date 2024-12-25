Write a function that finds the minimum weight in a weighted graph.
 Write the function for both adjacency matrix and adjacency list repre
sentation.
 int minimumWeight()

int Graph::minimumWeight() {
    int minWeight = INT_MAX;
    for (int i = 0; i < vertexCount; ++i) {
        for (int j = 0; j < vertexCount; ++j) {
            if (edges[i][j] != 0 && edges[i][j] < minWeight) {
                minWeight = edges[i][j];
            }
        }
    }
    if (minWeight == INT_MAX) {
        return -1;
    }
    return minWeight;
}

int Graph::minimumWeight() const {
    int minWeight = INT_MAX;
    for (int i = 0; i < vertexCount; ++i) {
        Edge* edge = edges[i].getHead();
        while (edge != nullptr) {
            if (edge->getWeight() < minWeight) {
                minWeight = edge->getWeight();
            }
            edge = edge->getNext();
        }
    }
    if (minWeight == INT_MAX) {
        return -1;
    }
    return minWeight;
}

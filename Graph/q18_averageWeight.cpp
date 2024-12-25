Write a function that finds the average weight in a weighted graph.
 Write the function for both adjacency matrix and adjacency list repre
sentation.
 double averageWeight()
// adjacency matrix
double Graph::averageWeight() const {
    int totalWeight = 0;
    int edgeCount = 0;
    
    for (int i = 0; i < vertexCount; ++i) {
        for (int j = 0; j < vertexCount; ++j) {
            if (edges[i][j] != 0) {
                totalWeight += edges[i][j];
                ++edgeCount;
            }
        }
    }
    
    if (edgeCount == 0) {
        return 0;
    }
    return static_cast<double>(totalWeight) / edgeCount;
}
// adjacency list
double Graph::averageWeight() const {
    int totalWeight = 0;
    int edgeCount = 0;
    
    for (int i = 0; i < vertexCount; ++i) {
        Edge* edge = edges[i].getHead();
        while (edge != nullptr) {
            totalWeight += edge->getWeight();
            ++edgeCount;
            edge = edge->getNext();
        }
    }
    
    return (edgeCount == 0) ? 0 : static_cast<double>(totalWeight) / edgeCount;
}
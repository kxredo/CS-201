Write a function that finds the average weight in a weighted graph.
 Write the function for both adjacency matrix and adjacency list repre
sentation.
 double averageWeight()
// adjacency matrix
double averageWeight() const {
    double totalWeight = 0;
    int edgeCount = 0;
    
    for (int i = 0; i < vertexCount; ++i) {
        for (int j = 0; j < vertexCount; ++j) {
            if (edges[i][j] != 0) {
                totalWeight += edges[i][j];
                ++edgeCount;
            }
        }
    }
    return <double>(totalWeight) / edgeCount;
}
// adjacency list
public double averageWeight() {
    double totalWeight = 0;
    int edgeCount = 0;
    
    for (int i = 0; i < vertexCount; i++) {
        Edge edge = edges[i].getHead();
        while (edge != null) {
            totalWeight += edge.getWeight();
            edgeCount++;
            edge = edge.getNext();
        }
    }
    return totalWeight / edgeCount;
}
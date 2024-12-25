Write a function that computes the number of edges in a graph. Write
 functions for both adjacency-matrix and adjacency-list representations.
 int edgeCount()

// adjacency matrix
int Graph::edgeCount() {
    int count = 0;
    for (int i = 0; i < vertexCount; ++i) {
        for (int j = 0; j < vertexCount; ++j) {
            if (edges[i][j] > 0) {
                count++;
            }
        }
    }
    return count;
}

// adjacency list
int Graph::edgeCount() {
    int count = 0;
    for (int i = 0; i < vertexCount; ++i) {
        Edge* edge = edges[i].getHead();
        while (edge != nullptr) {
            count++;
            edge = edge->getNext();
        }
    }
    return count;
}
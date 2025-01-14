In a given graph, the degree of a vertex is the sum of incoming edges
 and outgoing edges. Given the index of a vertex, write a function

 that determines the degree of that vertex. Write functions for both
 adjacency-matrix and adjacency-list representations.
 int degree(int index)

// adjacency matrix
int Graph::degree(int index) {
    int degree = 0;
    // Outgoing edges
    for (int j = 0; j < vertexCount; ++j) {
        if (edges[index][j] > 0) {
            degree++;
        }
    }
    // Incoming edges
    for (int i = 0; i < vertexCount; ++i) {
        if (edges[i][index] > 0) {
            degree++;
        }
    }
    return degree;
}

int Graph::degree(int index) {
    int degree = 0;
    // Outgoing edges
    Edge* edge = edges[index].getHead();
    while (edge != nullptr) {
        degree++;
        edge = edge->getNext();
    }
    // Incoming edges
    for (int i = 0; i < vertexCount; ++i) {
        edge = edges[i].getHead();
        while (edge != nullptr) {
            if (edge->getTo() == index) {
                degree++;
            }
            edge = edge->getNext();
        }
    }
    return degree;
}
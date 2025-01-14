Given a graph, write a function that determines if it is undirected.
 Write functions for both adjacency-matrix and adjacency-list represen
tations.
 boolean isUndirected()

// adjacency matrix
bool Graph::isUndirected() {
    for (int i = 0; i < vertexCount; ++i) {
        for (int j = 0; j < vertexCount; ++j) {
            if (edges[i][j] == edges[j][i]) {
                return true;
            }
        }
    }
    return false;
}

// adjacency list
bool Graph::isUndirected() {
    for (int i = 0; i < vertexCount; ++i) {
        Edge* edge = edges[i].getHead();
        while (edge != nullptr) {
            int to = edge->getTo();
            bool found = false;
            Edge* reverseEdge = edges[to].getHead();
            while (reverseEdge != nullptr) {
                if (reverseEdge->getTo() == i) {
                    found = true;
                    break;
                }
                reverseEdge = reverseEdge->getNext();
            }
            if (!found) {
                return false;
            }
            edge = edge->getNext();
        }
    }
    return true;
}
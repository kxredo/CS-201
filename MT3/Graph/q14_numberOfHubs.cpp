A node in a web graph is called a hub, if it has more incoming edges
 than outgoing edges. Write a method that finds the number of hubs
 in a graph. Write the function for both adjacency list and adjacency
 matrix representations.
 int numberOfHubs()

// adjacency matrix
int GraphMatrix::numberOfHubs() const {
    int count = 0;
    int incoming = 0;
    int outgoing = 0;

    for (int i = 0; i < vertexCount; i++) {
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

// adjacency list
int Graph::numberOfHubs() {
    int count = 0;
    for (int i = 0; i < vertexCount; ++i) {
        int incoming = 0, outgoing = 0;
        for (int from = 0; from < vertexCount; ++from) {
            Edge* edge = edges[from].getHead();
            while (edge != nullptr) {
                if (edge->getTo() == i) {
                    incoming++;
                }
                if (from == i) {
                    outgoing++;
                }
                edge = edge->getNext();
            }
        }
        if (incoming > outgoing) {
            count++;
        }
    }
    return count;
}
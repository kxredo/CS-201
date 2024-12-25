



bool Graph::isComplete() const {
        for (int i = 0; i < vertexCount; ++i) {
            for (int j = 0; j < vertexCount; ++j) {
                if (i != j && edges[i][j] == 0) {
                    return false; // If there is any missing edge, the graph is not complete
                }
            }
        }
        return true; // All edges are present
    }



    bool Graph::isComplete() const {
        for (int i = 0; i < vertexCount; ++i) {
            int edgeCount = 0;
            Edge* edge = edges[i].getHead();
            while (edge != nullptr) {
                edgeCount++;
                edge = edge->getNext();
            }
            if (edgeCount != vertexCount - 1) {
                return false; // If the vertex does not have the correct number of edges
            }
        }
        return true; // All vertices have the correct number of edges
    }

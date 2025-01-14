Write a function that computes the number of bidirectional edges in a
 graph. Write the function for adjacency list representation.
 
 int bidirectionalEdges ()
namespace list {

    int Graph::bidirectionalEdges() const {
        int count = 0;
        for (int i = 0; i < vertexCount; ++i) {
            Edge* edge = edges[i].getHead();
            while (edge != nullptr) {
                int toNode = edge->getTo();
                Edge* reverseEdge = edges[toNode].getHead();
                while (reverseEdge != nullptr) {
                    if (reverseEdge->getTo() == i) {
                        count++;
                        break;
                    }
                    reverseEdge = reverseEdge->getNext();
                }
                edge = edge->getNext();
            }
        }
        return count / 2; // Each bidirectional edge is counted twice
    }

}
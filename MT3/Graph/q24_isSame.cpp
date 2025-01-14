Write a method which checks if two graphs are the same. Assume that,
 the method is written in the Adjacency list representation of a graph.
 boolean isSame(Graph g)

namespace list {

    bool Graph::isSame(const Graph& g) const {
        if (vertexCount != g.vertexCount) {
            return false;
        }

        for (int i = 0; i < vertexCount; ++i) {
            Edge *edge1 = edges[i].getHead();
            Edge *edge2 = g.edges[i].getHead();
            
            // Compare all edges for each vertex
            while (edge1 != nullptr && edge2 != nullptr) {
                if (edge1->getTo() != edge2->getTo() || edge1->getWeight() != edge2->getWeight()) {
                    return false;
                }
                edge1 = edge1->getNext();
                edge2 = edge2->getNext();
            }
            
            if (edge1 != nullptr || edge2 != nullptr) {
                return false; // Different number of edges
            }
        }
        
        return true;
    }

}
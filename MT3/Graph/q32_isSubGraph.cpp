Write the method in array implementation
 bool isSubGraph(constGraph &g)
 which returns true if g is a subgraph of the current graph, false other
wise.A graph G1 is a subgraph of graph G2 if every edge of graph G1
 is also an edge in graph G2.

    bool Graph::isSubGraph(const Graph& g) const {
        for (int i = 0; i < g.vertexCount; ++i) {
            for (int j = 0; j < g.vertexCount; ++j) {
                if (g.edges[i][j] > 0 && edges[i][j] <= 0) {
                    return false;
                }
            }
        }
        return true;
    }


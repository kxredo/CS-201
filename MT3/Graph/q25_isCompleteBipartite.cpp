Write a method that checks if the graph is complete bipartite graph or
 not. Write the function for adjacency matrix representation. A graph
 (V1, V2) is said to be a complete bipartite graph if every vertex in V1 is
 connected to every vertex of V2.
 boolean isCompleteBipartite()

    bool Graph::isCompleteBipartite() const {
        int *set = new int[vertexCount];
        for (int i = 0; i < vertexCount; ++i) {
            set[i] = -1; // -1 indicates that the vertex is not yet assigned to a set
        }
        Queue queue(vertexCount);
        set[0] = 0; // Assign first vertex to set 0
        queue.enqueue(Element(0));

        while (!queue.isEmpty()) {
            int v = queue.dequeue().getData();
            for (int u = 0; u < vertexCount; ++u) {
                if (edges[v][u] > 0) { // There is an edge between v and u
                    if (set[u] == -1) {
                        // Assign u to the opposite set of v
                        set[u] = 1 - set[v];
                        queue.enqueue(Element(u));
                    } else if (set[u] == set[v]) {
                        return false;
                    }}}}
=        for (int i = 0; i < vertexCount; ++i) {
            for (int j = 0; j < vertexCount; ++j) {
                if (i != j && set[i] != set[j] && edges[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

}
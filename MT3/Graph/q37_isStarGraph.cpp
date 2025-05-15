Write the method in array (adjacency matrix) implementation
 bool isStarGraph()
 which returns whether graph is a star graph or not. Star graph is
 obtained by connecting a node to all the remaining nodes. If a graph
 has n nodes, there are n-1 edges as shown in example star graph below.
 You are not allowed to use depth first search or breadth first search.

 bool Graph::isStarGraph() {
        int centerCount = 0;
        int leafCount = 0;
        int degree = 0;
    
        for (int i = 0; i < vertexCount; ++i) {
            for (int j = 0; j < vertexCount; ++j) {
                degree += edges[i][j];
            }
            if (degree == vertexCount - 1) {
                centerCount++;
            } else if (degree == 1) {
                leafCount++;
            } else {
                return false;
            }
        }
        return (centerCount == 1 && leafCount == vertexCount - 1);
    }
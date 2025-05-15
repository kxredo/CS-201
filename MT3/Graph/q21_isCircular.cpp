A graph represents a ring topology if all the nodes create a circular
 path. Each node is connected to two others, like points on a circle.
 Write a class method in Graph class for adjacency list representation
 which checks if the corresponding graph is circular or not.
 boolean isCircular ()

 public boolean isCircular() {
    if (vertexCount == 0) return false;
    int[] inDegree = new int[vertexCount];
    int[] outDegree = new int[vertexCount];
    
    // Count degrees
    for (int i = 0; i < vertexCount; i++) {
        Edge edge = edges[i].getHead();
        while (edge != null) {
            outDegree[i]++;
            inDegree[edge.getTo()]++;
            edge = edge.getNext();
        }
    }
    for (int i = 0; i < vertexCount; i++) {
        if (inDegree[i] != 1 || outDegree[i] != 1) return false;
    }
    boolean[] visited = new boolean[vertexCount];
    int current = 0, count = 0;
    
    while (!visited[current] && count < vertexCount) {
        visited[current] = true;
        count++;
        current = edges[current].getHead().getTo();
    }
    return count == vertexCount && current == 0;
}
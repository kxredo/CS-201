A graph represents a ring topology if all the nodes create a circular
 path. Each node is connected to two others, like points on a circle.
 Write a class method in Graph class for adjacency list representation
 which checks if the corresponding graph is circular or not.
 boolean isCircular ()

bool Graph::isCircular() {
    if (vertexCount <= 1) return false;
    
    // Check if each vertex has exactly 2 neighbors
    for (int i = 0; i < vertexCount; i++) {
        if (adjList[i].size() != 2) {
            return false;
        }
    }
    
    // Follow the path starting from vertex 0
    int current = 0;
    int count = 1;
    int next = adjList[0][0];  // Take first neighbor
    
    while (next != 0 && count < vertexCount) {
        // Get the next vertex (the one that's not where we came from)
        int temp;
    if (adjList[next][0] == current) {
        temp = adjList[next][1];
    } else {
        temp = adjList[next][0];
    }
        current = next;
        next = temp;
        count++;
    }
    
    return count == vertexCount && next == 0;
}
/*
Modify the depth first search recursive implementation
of Graph such that it checks if there is a path from the node index1 to
index2.
bool depthFirstSearch(bool* visited, int index1, int index2)
*/

bool Graph::depthFirstSearch(bool* visited, int index1, int index2) {
    // Mark current node as visited
    visited[index1] = true;
    
    // If we reached the target node, return true
    if (index1 == index2) {
        return true;
    }
    
    // Explore all adjacent nodes
    Edge* edge = edges[index1].getHead();
    while (edge != nullptr) {
        int toNode = edge->getTo();
        if (!visited[toNode]) {
            // Recursively search from the adjacent node
            if (depthFirstSearch(visited, toNode, index2)) {
                return true;
            }
        }
        edge = edge->getNext();
    }
    
    // No path found from this node
    return false;
}

bool Graph::depthFirstSearch(bool* visited, int index1, int index2) {
    if (index1 == index2) {
        return true;
    }
    visited[index1] = true;
    Edge* edge = edges[index1].getHead();
    while (edge != nullptr) {
        int toNode = edge->getTo();
        if (!visited[toNode]) {
            if (depthFirstSearch(visited, toNode, index2)) {
                return true;
            }
        }
        edge = edge->getNext();
    }
    return false;
}
Modify the breadth first search linked list implementation such that
 it will store the indexes of the nodes of the shortest paths from the
 start node in paths parameter.
 void shortest(int∗∗ paths, bool∗ visited , int start )
 At the end of the execution, the indexes in the paths[i] array will show
 the path visited from node start to node i. You may assume that the
 visited array is initialized to false and paths array is already allocated.
 

public void shortest(int[][] paths, boolean[] visited, int start) {
    int fromNode, toNode;
    for (int i = 0; i < vertexCount; i++) {
        paths[i][0] = start;
    }
    int[] pathLengths = new int[vertexCount];
    for (int i = 0; i < vertexCount; i++) {
        pathLengths[i] = 1; // Start node only
    }
    visited[start] = true;
    Queue queue = new Queue();
    queue.enqueue(new Node(start));
    while (!queue.isEmpty()) {
        fromNode = queue.dequeue().getData();
        Edge edge = edges[fromNode].getHead();
        while (edge != null) {
            toNode = edge.getTo();
            if (!visited[toNode]) {
                visited[toNode] = true;
                for (int i = 0; i < pathLengths[fromNode]; i++) {
                    paths[toNode][i] = paths[fromNode][i];
                }
                paths[toNode][pathLengths[fromNode]] = toNode;
                pathLengths[toNode] = pathLengths[fromNode] + 1;
                queue.enqueue(new Node(toNode));
            }
            edge = edge.getNext();
        }
    }
}
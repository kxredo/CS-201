For a directed weighted graph, write the method in array implementa
tion
 int lengthOfCircle ()
 which returns length of the circle assuming that the graph is a circular
 graph. A graph is circular if all the nodes create a circular path. Each
 node is connected to two others, like points on a circle.

 namespace array {

    int Graph::lengthOfCircle() {
        int totalLength = 0;
        int currentNode = 0;
        bool *visited = new bool[vertexCount];

        // Initialize visited array
        for (int i = 0; i < vertexCount; ++i) {
            visited[i] = false;
        }

        // Traverse the circular path
        while (!visited[currentNode]) {
            visited[currentNode] = true;
            for (int nextNode = 0; nextNode < vertexCount; ++nextNode) {
                if (edges[currentNode][nextNode] > 0) {
                    totalLength += edges[currentNode][nextNode];
                    currentNode = nextNode;
                    break;
                }
            }
        }

        delete[] visited;
        return totalLength;
    }

}
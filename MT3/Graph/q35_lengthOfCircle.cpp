For a directed weighted graph, write the method in array implementa
tion
 int lengthOfCircle ()
 which returns length of the circle assuming that the graph is a circular
 graph. A graph is circular if all the nodes create a circular path. Each
 node is connected to two others, like points on a circle.


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
            for (int i = 0; i < vertexCount; ++i) {
                if (edges[currentNode][i] > 0) {
                    totalLength += edges[currentNode][i];
                    currentNode = i;
                    break;
                }
            }
        }
        delete[] visited;
        return totalLength;
    }

}
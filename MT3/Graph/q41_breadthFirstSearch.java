package MT3.Graph;

import java.util.Queue;

public class q41_breadthFirstSearch {

    void breadthFirstSearch(boolean[] visited, int startNode) {
        int fromNode;
        Queue queue = new Queue(100);
        queue.enqueue(new Element(startNode));
        while (!queue.isEmpty()) {
            fromNode = queue.dequeue().getData();
            for (int toNode = 0; toNode < vertexCount; toNode++) {
                if (edges[fromNode][toNode] > 0) {
                    if (!visited[toNode]) {
                        visited[toNode] = true;
                        queue.enqueue(new Element(toNode));
                    }
                }
            }
        }
    }
}

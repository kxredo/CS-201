Modify the breadth first search linked list implementation such that
 it will store the length of the shortest paths from the start node in
 lengths parameter.
 void shortest(int∗ 
lengths, int start )
 At the end of the execution, lengths[i] will show the shortest path
 length from node start to node i. You may assume that the path length
 elements are initialized to vertexCount (number of nodes, which should
 be larger than any possible shortest path) when you call the function.

namespace list {

    void Graph::shortest(int* lengths, int start) {
        Edge* edge;
        int fromNode, toNode;
        Queue queue = Queue();
        visited[start] = true;
        lengths[start] = 0;
        queue.enqueue(new Node(start));

        while (!queue.isEmpty()) {
            fromNode = queue.dequeue()->getData();
            edge = edges[fromNode].getHead();
            while (edge != nullptr) {
                toNode = edge->getTo();
                if (lengths[toNode] > lengths[fromNode] + 1) {
                    lengths[toNode] = lengths[fromNode] + 1;
                    queue.enqueue(new Node(toNode));
                }
                edge = edge->getNext();
            }
        }
    }

}
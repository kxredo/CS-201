package MT3.Graph;

import java.util.Queue;
/*
Modify the breadth first search linked list implementation
 of Graph such that it checks if there is a path from the node index1 to
 index2.
 bool breadthFirstSearch(bool ∗ visit , int index1, int index2)
 */
public class q41_breadthFirstSearch {

bool Graph::breadthFirstSearch(bool* visited, int index1, int index2) {
    Edge* edge;
    int fromNode, toNode;
    Queue queue = Queue();
    queue.enqueue(new Node(index1));
    visited[index1] = true;
    while (!queue.isEmpty()) {
        fromNode = queue.dequeue()->getData();
        if (fromNode == index2) {
            return true;
        }
        edge = edges[fromNode].getHead();
        while (edge != nullptr) {
            toNode = edge->getTo();
            if (!visited[toNode]) {
                visited[toNode] = true;
                queue.enqueue(new Node(toNode));
            }
            edge = edge->getNext();
        }
    }
    return false;
}

}

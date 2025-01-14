Modify the breadth first search linked list implementation such that
 it will store the indexes of the nodes of the shortest paths from the
 start node in paths parameter.
 void shortest(int∗∗ 
paths, bool∗ 
visited , int start )
 At the end of the execution, the indexes in the paths[i] array will show
 the path visited from node start to node i. You may assume that the
 visited array is initialized to false and paths array is already allocated.
 
void Graph::shortest(int *lengths, int start) {
    Edge* edge;
    int fromNode;
    int toNode;
    Queue queue = Queue();
    length[start] = 0;
    queue.enqueue(newNode(start));

    while(!queue.isEmpty()) {
        fromNode = queue.dequeue()->getData();
        edge = edges[fromNode].getHead();
        while(edge!=nullptr) {
            toNode = edge ->getTo();
            if(length[toNode] == vertexCount){
                length[toNode] = length[fromNode] + 1;
                queue.enqueue(new Node(toNode));
            }
            edge = edge->getNext();
        }
    }
}
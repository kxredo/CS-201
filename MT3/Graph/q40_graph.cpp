package MT3.Graph;

public class q40_graph {

    /*
    Write a new constructor for Graph class for linked list
 implementation
 Graph(Graph∗
graphs, int size)
 which constructs a new graph by merging all graphs in the graph array.
 Size represents the number of graphs in graphs. You can assume that
 all graphs have the same size, and the intersections of the graphs are
 empty.
     */
    Graph::Graph(Graph* graphs, int size) 
    : AbstractGraph(graphs[0].vertexCount * size) {
        int offset = 0;
        for (int i = 0; i < size; i++) {
            for (int v = 0; v < graphs[i].vertexCount; v++) {
                Edge* edge = graphs[i].edges[v].getHead();
                while (edge != nullptr) {
                    int from = edge->getFrom() + offset;
                    int to = edge->getTo() + offset;
                    addEdge(from, to, edge->getWeight());
                    edge = edge->getNext();
                }
            }
            offset += graphs[i].vertexCount;
        }
    }
}

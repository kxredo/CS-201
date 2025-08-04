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
    public Graph(Graph[] graphs, int size) {
        super(graphs[0].vertexCount);
        edges = new EdgeList[vertexCount];
        for (int i = 0; i < vertexCount; i++) {
            edges[i] = new EdgeList();
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < vertexCount; j++) {
                Edge edge = graphs[i].edges[j].getHead();
                while (edge != null) {
                    addEdge(j, edge.getTo(), edge.getWeight());
                    edge = edge.getNext();
                }
            }
        }
    }
}

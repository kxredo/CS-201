Write a function that converts a graph with adjacency matrix repre
sentation to a graph with adjacency list representation.
 Graph matrixToList()

#include "../List/Graph/Graph.h"

list::Graph* Graph::matrixToList() {
    list::Graph* listGraph = new list::Graph(vertexCount);
    for (int i = 0; i < vertexCount; ++i) {
        for (int j = 0; j < vertexCount; ++j) {
            if (edges[i][j] != 0) {
                listGraph->addEdge(i, j, edges[i][j]);
            }
        }
    }
    return listGraph;
}
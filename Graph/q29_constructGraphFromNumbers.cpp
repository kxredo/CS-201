 Write the method in linked list implementation
 Graph constructGraphFromNumbers(int N)
 which constructs a graph from numbers 0, 1, 2, ..., N- 1; where the
 numbers represent the node indexes and two nodes are connected if
 they have common divisor other than 1.
 
#include <cmath>

namespace array {

    Graph Graph::constructGraphFromNumbers(int N) {
        Graph graph(N);
        for (int i = 2; i < N; ++i) {
            for (int j = 2; j <= std::sqrt(i); ++j) {
                if (i % j == 0) {
                    // i and j have a common divisor other than 1
                    for (int k = i + j; k < N; k += j) {
                        graph.addEdge(i, k);
                        graph.addEdge(k, i);
                    }
                }
            }
        }
        return graph;
    }

}
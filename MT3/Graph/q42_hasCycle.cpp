package MT3.Graph;
/*
 Given a directed graph represented by adjacency matrix,
 write a recursive method
 bool hasCycle(int v, bool∗ visited )

 in the Graph class that determines whether the graph contains any
 cycles starting form vertex v. Use the same idea in Depth-First Search
 (DFS). Your method should return true if there is at least one cycle in
 the graph, and false otherwise.
 */
public class q42_hasCycle {

    boolean hasCycle(int v, boolean[] visited) {
        if (visited[v]) {
            return true; // Cycle detected
        }
        visited[v] = true;
        for (int i = 0; i < vertexCount; i++) {
            if (edges[v][i] > 0) {
                if (hasCycle(i, visited)) {
                    return true;
                }
            }
        }
        visited[v] = false; // Backtrack
        return false;

    }
}

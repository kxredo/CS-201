package MT3.Graph;

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

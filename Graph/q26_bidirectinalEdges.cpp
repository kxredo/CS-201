
#include <vector>
#include <algorithm>

bool Graph::isCompleteBipartite() const {
    std::vector<int> colors(vertexCount, -1);

    // Helper function to perform DFS and color the graph
    auto dfs = [&](int node, int color) {
        int stack[vertexCount];
        int top = 0;
        stack[top++] = node;
        colors[node] = color;

        while (top > 0) {
            int u = stack[--top];
            for (int v = 0; v < vertexCount; ++v) {
                if (edges[u][v] > 0) {
                    if (colors[v] == -1) {
                        colors[v] = 1 - colors[u];
                        stack[top++] = v;
                    } else if (colors[v] == colors[u]) {
                        return false;
                    }
                }
            }
        }
        return true;
    };

    // Color the graph and check for bipartite property
    for (int i = 0; i < vertexCount; ++i) {
        if (colors[i] == -1) {
            if (!dfs(i, 0)) {
                return false;
            }
        }
    }

    // Check if it is a complete bipartite graph
    for (int u = 0; u < vertexCount; ++u) {
        for (int v = 0; v < vertexCount; ++v) {
            if (colors[u] != colors[v] && edges[u][v] == 0) {
                return false;
            }
        }
    }

    return true;
}
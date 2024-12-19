

#include <vector>
#include <queue>

bool GraphList::isCircular() const {
    if (vertexCount < 3) return false;

    std::vector<int> degree(vertexCount, 0);
    std::queue<int> q;

    // Count degree of each vertex
    for (int i = 0; i < vertexCount; i++) {
        for (const auto& edge : adjList[i]) {
            degree[i]++;
        }
    }

    // Enqueue nodes with degree not equal to 2
    for (int i = 0; i < vertexCount; i++) {
        if (degree[i] != 2) {
            q.push(i);
        }
    }

    // Remove vertices with degree not equal to 2
    while (!q.empty()) {
        int u = q.front();
        q.pop();
        for (const auto& edge : adjList[u]) {
            int v = edge.to;
            degree[v]--;
            if (degree[v] == 0) return false;
            if (degree[v] == 1) q.push(v);
        }
    }

    // Check if all remaining vertices have degree 2
    for (int i = 0; i < vertexCount; i++) {
        if (degree[i] != 2) return false;
    }

    return true;
}
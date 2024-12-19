

#include <vector>
#include <queue>

bool GraphList::isBipartite() const {
    std::vector<int> colors(vertexCount, -1);

    for (int start = 0; start < vertexCount; start++) {
        if (colors[start] == -1) {
            std::queue<int> q;
            q.push(start);
            colors[start] = 0;

            while (!q.empty()) {
                int u = q.front();
                q.pop();

                for (const auto& edge : adjList[u]) {
                    int v = edge.to;
                    if (colors[v] == -1) {
                        colors[v] = 1 - colors[u];
                        q.push(v);
                    } else if (colors[v] == colors[u]) {
                        return false;
                    }
                }
            }
        }
    }
    return true;
}


#include <vector>
#include <algorithm>

bool GraphList::isSame(const GraphList& g) const {
    if (vertexCount != g.vertexCount) return false;

    for (int i = 0; i < vertexCount; i++) {
        if (adjList[i].size() != g.adjList[i].size()) return false;

        int thisNeighbors[vertexCount];
        int otherNeighbors[vertexCount];
        int index = 0;

        for (const auto& edge : adjList[i]) {
            thisNeighbors[index] = edge.to;
            index++;
        }

        index = 0;
        for (const auto& edge : g.adjList[i]) {
            otherNeighbors[index] = edge.to;
            index++;
        }

        std::sort(thisNeighbors, thisNeighbors + adjList[i].size());
        std::sort(otherNeighbors, otherNeighbors + g.adjList[i].size());

        for (int j = 0; j < adjList[i].size(); j++) {
            if (thisNeighbors[j] != otherNeighbors[j]) return false;
        }
    }

    return true;
}
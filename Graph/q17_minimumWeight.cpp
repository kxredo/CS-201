

int GraphList::minimumWeight() const {
    int minWeight = INT_MAX;
    for (int i = 0; i < vertexCount; i++) {
        for (const auto& edge : adjList[i]) {
            if (edge.weight < minWeight) {
                minWeight = edge.weight;
            }
        }
    }
    return minWeight == INT_MAX ? -1 : minWeight; // Return -1 if no edges
}
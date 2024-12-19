
#include <vector>
#include <algorithm>

int GraphMatrix::medianWeight() const {
    std::vector<int> weights;
    for (int i = 0; i < vertexCount; i++) {
        for (int j = 0; j < vertexCount; j++) {
            if (edges[i][j] != 0) {
                weights.push_back(edges[i][j]);
            }
        }
    }
    if (weights.empty()) {
        return 0; // or any other value indicating no edges
    }
    std::sort(weights.begin(), weights.end());
    int n = weights.size();
    if (n % 2 == 0) {
        return (weights[n / 2 - 1] + weights[n / 2]) / 2;
    } else {
        return weights[n / 2];
    }
}


#include <vector>

bool isCompleteMatrix(const std::vector<std::vector<int>>& matrix) {
    int n = matrix.size();
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (i != j && matrix[i][j] == 0) {
                return false;
            }
        }
    }
    return true;
}


#include <vector>

bool isCompleteList(const std::vector<std::vector<int>>& adjList) {
    int n = adjList.size();
    for (int i = 0; i < n; i++) {
        if (adjList[i].size() != n - 1) {
            return false;
        }
    }
    return true;
}
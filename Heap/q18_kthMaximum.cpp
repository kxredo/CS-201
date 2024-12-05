

#include <queue>
#include <vector>

int kthMaximum(int array[], int N, int k) {
    std::priority_queue<int, std::vector<int>, std::greater<int>> minHeap;

    for (int i = 0; i < N; ++i) {
        minHeap.push(array[i]);
        if (minHeap.size() > k) {
            minHeap.pop();
        }
    }

    return minHeap.top();
}
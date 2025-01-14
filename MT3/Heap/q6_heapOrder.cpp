
bool heapOrder(int A[], int N) {
    for (int i = 0; i <= (N - 2) / 2; ++i) {
        // Check if the left child exists and is greater than the parent
        if (2 * i + 1 < N && A[i] < A[2 * i + 1]) {
            return false;
        }
        // Check if the right child exists and is greater than the parent
        if (2 * i + 2 < N && A[i] < A[2 * i + 2]) {
            return false;
        }
    }
    return true;
}
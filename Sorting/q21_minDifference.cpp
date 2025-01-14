Suppose you are given an array of N integers. Write an O(N logN)
 algorithm that find the minimum difference between any two elements
 in this array.
 int minDifference(int [] A)

int minDifference(int[] A) {
    sort(A, A + A.size());
    int min = INT_MAX;
    for (int i = 0; i < A.size() - 1; i++) {
        min = min(min, A[i+1] - A[i]);
    }
    return min;
}

Suppose arrays representing sets A and B are both sorted. Write a
 linear time method that finds the minimum difference between any
 element from A and any element from B.
 int minDifference(int [] A, int [] B)

int minDifference(int[] A, int[] B) {
    int i = 0, j = 0;
    int minDiff = INT_MAX;
    while (i < A.length && j < B.length) {
        minDiff = min(minDiff, abs(A[i] - B[j]));
        if (A[i] < B[j]) i++;
        else j++;
    }
    return minDiff;
}

Suppose you are given three sorted arrays A, B, and C. Write a function
 that returns the number of elements which are in A, B, and C.
 int inABC(int[] A, int [] B, int [] C)

int inABC(int[] A, int[] B, int[] C) {
    int i = 0, j = 0, k = 0;
    int count = 0;

    // Traverse through all three arrays
    while (i < A.length && j < B.length && k < C.length) {
        if (A[i] == B[j] && B[j] == C[k]) {
            // All three elements are equal, increment the count
            count++;
            i++;
            j++;
            k++;
        } else if (A[i] < B[j]) {
            // A[i] is smaller, increment i
            i++;
        } else if (B[j] < C[k]) {
            // B[j] is smaller, increment j
            j++;
        } else {
            // C[k] is smaller, increment k
            k++;
        }
    }

    return count;
}

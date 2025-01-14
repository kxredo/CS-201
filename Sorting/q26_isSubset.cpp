Suppose arrays representing sets A and B are both sorted. Write a
 linear time method that finds if A is a subset of B.
 boolean isSubset(int [] A, int [] B)

boolean isSubset(int[] A, int[] B) {
    int i = 0, j = 0;
    
    // Traverse both arrays
    while (i < A.length && j < B.length) {
        if (A[i] == B[j]) {
            // If A[i] is found in B, move both pointers forward
            i++;
            j++;
        } else if (A[i] < B[j]) {
            // If A[i] is smaller, move i forward
            i++;
        } else {
            // If B[j] is smaller, move j forward
            j++;
        }
    }
    
    // If i has traversed all of A, A is a subset of B
    return i == A.length;
}



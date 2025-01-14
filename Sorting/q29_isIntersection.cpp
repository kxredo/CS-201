Suppose arrays representing sets A and B are both sorted. Write a
 method with linear complexity in MergeSort class that finds if C
 is the intersection of sets A and B. You are only allowed to use 1 loop.
 bool isIntersection (int∗ 
A, int∗ 
B, int∗ 
C, int sizeA, int sizeB, int sizeC)

bool isIntersection(int* A, int* B, int* C, int sizeA, int sizeB, int sizeC) {
        int i = 0, j = 0, k = 0;
        // Traverse A, B, and C to check if C is the intersection of A and B
        while (i < sizeA && j < sizeB && k < sizeC) {
            if (A[i] < B[j]) {
                // Move pointer in A if A[i] is smaller
                i++;
            } else if (A[i] > B[j]) {
                // Move pointer in B if B[j] is smaller
                j++;
            } else {
                // If A[i] == B[j], check if it matches C[k]
                if (A[i] == C[k]) {
                    k++;  // Move pointer in C
                }
                // Move both pointers for A and B when they match
                i++;
                j++;
            }
        }

        // If we have traversed all of C, it means C is the intersection of A and B
        return k == sizeC;
    }
};

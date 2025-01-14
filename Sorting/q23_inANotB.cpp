

Suppose you are given two sorted arrays A and B. Write a function
 that returns the number of elements which are in A but not in B.
 int inANotB(int[] A, int [] B)

int inANotB(int[] A, int[] B) {
    int i = 0, j = 0;
    int count = 0;

    while (i < A.length) {
        if (j < B.length && A[i] < B[j]) {
            // A[i] is in A but not in B
            count++;
            i++;
        } else if (j < B.length && A[i] == B[j]) {
            // A[i] is in both A and B, skip it
            i++;
            j++;
        } else {
            // A[i] is larger than B[j], move j forward
            j++;
        }
    }

    return count;
}


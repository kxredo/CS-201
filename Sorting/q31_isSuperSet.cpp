Suppose arrays representing sets A and B are both sorted. Write a
 method with linear complexity in MergeSort class that finds if A
 is a superset of B.
 bool isSuperSet(int∗ 
A, int∗ 
B, int sizeA, int sizeB)

bool isSuperSet(int* A, int* B, int sizeA, int sizeB) {
    int i = 0, j = 0;
    while (i < sizeA && j < sizeB) {
        if (A[i] < B[j]) return false;
        if (A[i] == B[j]) j++;
        i++;
    }
    return j == sizeB;
}

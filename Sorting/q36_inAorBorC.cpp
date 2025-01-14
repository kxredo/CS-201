Suppose you are given three sorted arrays A, B, and C. Write a function
 in MergeSort class that returns the number of elements which are in
 A or B or C. Assume that all arrays have the same size and the last
 elements of all three arrays are the same. Your algorithm should run
 in O(N) time.
 int inAorBorC(const int∗ 
A, const int∗ 
B, const int∗ 
C, int N)

int inAorBorC(int* A, int* B, int* C, int N){
    int i = 0, j = 0, k = 0;
    while(i < N && j < N && k < N){
        if(A[i] == B[j] || A[i] == C[k]) return true;
        if(B[j] < A[i] && B[j] < C[k]) j++;
        else if(C[k] < A[i] && C[k] < B[j]) k++;
        else i++;
    }
    return false;
}

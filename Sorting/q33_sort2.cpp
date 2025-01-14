Modify the original bubble sort such that
 void sort2(int∗ 
A, int∗ 
B, int∗ 
C, int N)
 uses B as a secondary and C as a ternary key. If two elements in A are
 equal, algorithm uses B as a secondary key. If also their keys in B are
 equal, the algorithm will then resort to C array. Do not modify arrays
 B and C. N is the number of elements in the array. Your modified
 method should run in O(N2) time.

void BubbleSort::sort2(int* A, int* B, int* C, int N) {
    bool exchange = true;
    while (exchange) {
        exchange = false;
        for (int i = 0; i < N - 1; i++) {
            if (A[i] > A[i + 1]) {
                exchange = true;
                int tmp = A[i];
                A[i] = A[i+1];
                A[i+1] = tmp;
            } else {
                if (A[i] == A[i+1]) {
                    if (B[i] > B[i+1]) {
                        exchange = true;
                        int tmp = A[i];
                        A[i] = A[i+1];
                        A[i+1] = tmp;
                    } else {
                        if (B[i] == B[i+1]) {
                            if (C[i] > C[i+1]) {
                                exchange = true;
                                int tmp = A[i];
                                A[i] = A[i+1];
                                A[i+1] = tmp;
                            }
                        }
                    }
                }
            }
        }
    }
}

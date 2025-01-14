Modify the original selection sort so that
 int∗ 
sortNew(int∗ 
A, int∗ 
B, int size)
 (i) it will return the original indexes of the elements as an array and
 (ii) uses B as a secondary key when keys in A are equal. If original list
 is 20, 10, 40, 30; after sorting A will be 10, 20, 30, 40, and it will return
 index array as 1, 0, 3, 2 (10 was at 1., 20 was at 0., 30 was at 3., 40
 was at 2. position in the beginning).

int* sortNew(int* A, int* B, int size){
    for(int i = 0; i < size; i++){
        int minIndex = i;
        for(int j = i + 1; j < size; j++){
            if(A[j] < A[minIndex]){
                minIndex = j;
            }
        }
    }
    return indexes;
}
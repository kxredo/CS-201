Suppose you have an array of N elements containing only two number
 0 and 1. Write a function to rearrange the list so that all 0’s precede
 all 1’s. The time complexity of your function should be O(N).
 void sort01(int [] A)

void sort01(int [] A) {
    int i = 0;
    int j = A.size() - 1;
    while (i < j) {
        while (A[i] == 0){
            i++;
        }
        while (A[j] == 1){
            j--;
        } 
        if (i < j) {
            int tmp = A[i];
            A[i] = A[j];
            A[j] = tmp;
        }
    }
}

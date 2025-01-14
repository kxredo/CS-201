Suppose you are given an unsorted array of N integers and number X. Write an O(N) algorithm to partition the
 numbers in the array such that, the numbers that are smaller than X
 will be in the first part, the numbers that are equal to X will be in the second part, and the numbers that are larger than X will be in third part.
 void threePartitionArray (int [] A, int N, int X){
    int i = 0; // i: Points to the next position where a number smaller than X should be placed
    int j = N-1; // j: Points to the next position where a number larger than X should be placed (from the end of the array).
    int k = 0; // k: The current element being examined.

    while(k<=j){
        if(A[k] < X ){
            int tmp = A[i];
            A[i] = A[k];
            A[k] = tmp;
            i++;
            j++;
        } else if(A[k] > X){
            int tmp = A[j];
            A[j] = A[k];
            A[k] = tmp;
            j--;
        } else {
            k++;
        }
    }
 }


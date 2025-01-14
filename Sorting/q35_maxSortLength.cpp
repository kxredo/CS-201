Given an array of N numbers write a function that determines the
 maximum length of the sorted sublist in the array. A sublist start from
 index i and continues with indexes i+1, i+2, ..., i+k. Your function
 should run in O(N) time.
 int maxSortLength(int∗ 
A, int N)

int maxSortLength(int A, int N) {
    int max = 1;
    int tmp = 1;
    
    for(int i = 0; i < N; i++) {
        if(A[i] >= A[i-1]) {
            tmp++;
        } else {
            if(tmp>max) {
                max = tmp;
            }
            tmp = 1;
        }
    }
    if(tmp > max) {
        max = tmp;
    }
    return max;
}

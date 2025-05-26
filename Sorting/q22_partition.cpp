Suppose you are given an unsorted array of N integers and two numbers
 X and Y (Assume X <Y). Write an O(N) algorithm to partition the
 numbers in the array such that, the numbers that are smaller than X
 will be in the first part, the numbers that are larger than X but smaller

 than Y will be in the second part, and the numbers that are larger than
 Y will be in the third part.
 void partition (int [] A, int X, int Y)

void partition(int[] A, int X, int Y) {
    
    int low = 0, mid = 0, high = n - 1;

    while (mid <= high) {
        if (A[mid] < X) {
            // Swap A[low] and A[mid] and increment both pointers
            int temp = A[low];
            A[low] = A[mid];
            A[mid] = temp;
            low++;
            mid++;
        } else if (A[mid] >= X && A[mid] < Y) {
            // Element belongs in the middle part; just move the mid pointer
            mid++;
        } else {
            // Swap A[mid] and A[high] and decrement the high pointer
            int temp = A[mid];
            A[mid] = A[high];
            A[high] = temp;
            high--;
        }
    }
}


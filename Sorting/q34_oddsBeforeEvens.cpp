Implement a modified version of partition algorithm to write a method
 in QuickSort class
 void oddsBeforeEvens(int∗ 
A, int N)
 which moves the odd numbers before even ones in A in one pass. The
 algorithm is as follows:
 1. At the beginning of the algorithm, let say we have two indexes i
 and j, showing the first and last elements respectively.
 2. While i is less than j,
 •
 •
 Increment i until you find an odd number.
 Decrement j until you find an even number.
 375
10.12. EXERCISES
 •
 If i < j, swap the contents of i and j.
 3. Continue with step 2.

void QuickSort::oddsBeforeEvens(int* A, int size) {
    int i = 0;
    int j = size - 1;
    while (i < j) {
        while(i<size && A[i] % 2 !=0) {
            i++;
        }
        while(j>=0 && A[j] % 2 == 0) {
            j--;
        }
        if (i < j) {
            int tmp = A[i];
            A[i] = A[j];
            A[j] = tmp;
        }
    }
}


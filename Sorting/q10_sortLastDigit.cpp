Write a function that sorts an array of N elements with respect to their
 last digits. The time complexity of your function should be O(N).
 void sortLastDigit (int [] A)

void sortLastDigit(int[] A) {
    sort(A, A + A.size(), [](int a, int b) {
        return a % 10 < b % 10;
    });
}

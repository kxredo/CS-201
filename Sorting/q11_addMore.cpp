Suppose you are given a sorted list of N elements followed by √N
 randomly ordered elements. Write a function to sort the entire array.
 void addMore(int[] A)

void addMore(int[] A) {
    sort(A, A + A.size(), [](int a, int b) {
        return a < b;
    });
}


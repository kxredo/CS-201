Write a function that determines the number of misplaced pairs. Pair
 (i, j) is misplaced, if i comes before j when i > j.
 int misplaced Pairs(int [] A)

int misplaced_Pairs(int[]A) {
    int count = 0;
    for (int i = 0; i < A.size(); i++) {
        for (int j = i+1; j < A.size(); j++) {
            if (A[i] > A[j]) count++;
        }
    }
    return count;
}
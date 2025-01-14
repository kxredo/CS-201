 Suppose you are given two sorted arrays A and B. Write a function
 that finds elements in A △ B = (A- B) ∪ (B- A) (the elements that
 are in A but not in B and the elements that are in B but not in A) in
 O(N) time.
 int [] symmetric(int[] A, int [] B)

int[] symmetric(int[] A, int[] B) {
    int[] result = new int[A.size() + B.size()];
    int i = 0, j = 0, k = 0;
    while (i < A.size() && j < B.size()) {
        if (A[i] < B[j]) {
            result[k++] = A[i++];
        } else if (A[i] > B[j]) {
            result[k++] = B[j++];
        } else {
            i++; j++;
        }
    }
    return result;
}



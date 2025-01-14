

// Given an array of N numbers write a function that determines if there are four numbers whose sum ewuals a given number K. Your function should run in O(N^2logN) time. bool existsFour(int [] A, int K).

import java.util.Arrays;

boolean existsFour(int[] A, int K) {
    int n = A.length;

    // Step 1: Sort the array
    Arrays.sort(A); // O(N log N)

    // Step 2: Iterate over all pairs of elements
    for (int i = 0; i < n - 3; i++) {
        for (int j = i + 1; j < n - 2; j++) {
            // Calculate the target for the remaining two numbers
            int target = K - A[i] - A[j];

            // Step 3: Use two pointers to find the remaining two numbers
            int left = j + 1, right = n - 1;
            while (left < right) {
                int sum = A[left] + A[right];
                if (sum == target) {
                    return true;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
    }

    return false; // No such four numbers found
}



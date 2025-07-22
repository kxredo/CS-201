
public class q27_sumOfFourK {


/*
boolean sumOfFourK(int[] array, int K)
 that takes an array of integers as a parameter and returns true if the
 sum of four elements in the array is K. Your method should run in
 O(N2) time. You are only allowed to use an external array and an
 external hash table.
     */
    boolean sumOfFourK(int[] array, int K) {
        Hash hash = new Hash(array.length);
        int n = array.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = array[i] + array[j];
                hash.insert(sum);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int complement = K - (array[i] + array[j]);
                if (hash.search(complement) != null) {
                    return true;
                }
            }
        }
        return false;
    }
}

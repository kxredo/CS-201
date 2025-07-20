
public class q29_equalPairSums {

    /*
     Write a static method in the Hash class (array implementation)
 boolean equalPairSums(int[] array)
 This method should return true if any two distinct pairs in the array
 have the same sum. Your method should run in O(N2) time. You can
 use at most one external hash. Hint: You must store pairwise sums
 in the external hash table.
     */
    public static boolean equalPairSums(int[] array) {
        Hash hash = new Hash();
        int n = array.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = array[i] + array[j];
                if (hash.search(sum)) {
                    return true; // Found a pair with the same sum
                }
                hash.insert(sum); // Store the sum in the hash table
            }
        }
        return false; // No pairs found with the same sum
    }
}

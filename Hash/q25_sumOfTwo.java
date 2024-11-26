
import java.util.HashSet;
import java.util.Set;

public class q25_sumOfTwo {

    public static boolean sumOfTwoK(int[] array, int K) {
        // Create a hash table for storing the elements
        Hash hashTable = new Hash(array.length);

        // Step 1: Iterate through the array
        for (int i = 0; i < array.length; i++) {
            int complement = K - array[i];

            // Step 2: Check if the complement (K - array[i]) is already in the hash table
            if (hashTable.search(complement) != null) {
                return true; // We found two elements whose sum is K
            }

            // Step 3: Insert the current element into the hash table
            hashTable.insert(array[i]);
        }

        // Step 4: Return false if no pair is found
        return false;
    }

}

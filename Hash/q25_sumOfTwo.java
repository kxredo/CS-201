
import java.util.HashSet;
import java.util.Set;

public class q25_sumOfTwo {
// Create a hash table for storing the elements

    // Step 1: Iterate through the array
    // Step 2: Check if the complement (K - array[i]) is already in the hash table
    // Step 3: Insert the current element into the hash table
    // Step 4: Return false if no pair is found
    public static boolean sumOfTwoK(int[] array, int K) {
        Hash hashTable = new Hash(array.length);

        for (int i = 0; i < array.length; i++) {
            int complement = K - array[i];
            int index = hashTable.hashFunction(complement);
            while (hashTable.table[index] != null) {
                if (hashTable.table[index].key == complement) {
                    return true;
                }
                index = (index + 1) % hashTable.table.length;
            }
            hashTable.insert(array[i]);
        }
        return false;
    }

}

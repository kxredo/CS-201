
import java.util.HashSet;
import java.util.Set;
/*
boolean sumOfTwoK(int[] array, int K)
 that takes an array of integers as a parameter and returns true if the
 sum of two elements in the array is K. Your method should run in
 O(N) time. Do not use any external data structures or arrays except
 the external hash table.
 */
public class q25_sumOfTwo {
// Create a hash table for storing the elements

    public static boolean sumOfTwoK(int[] array, int K) {
        Hash hash = new Hash(array.length);

        for (int i = 0; i < array.length; i++) {
            int complement = K - array[i];     
            int index = hash.hashFunction(complement);
            
            while (hash.table[index] != null) {
                if (hash.table[index].key == complement) {     
                    return true;
                }
                index = (index + 1) % hash.table.length; // 
            }
            hash.insert(array[i]);
        }
        return false;
    }

}

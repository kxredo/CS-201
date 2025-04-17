
import java.lang.reflect.Array;
import java.util.Hashtable;

/*
Write a static method that takes an array of integers as a parameter
 and checks if the array contains any duplicate elements. Your method
 should run in O(N) time, where N is the size of the array. You are
 allowed to use any methods and external data structures we learned in
 the class.
 boolean anyDuplicate(int[] array)
 */
public class q18_anyDuplicate {

    public static boolean anyDuplicate(int[] array) {
        Hash hash = new Hash(array.length);

        for (int i = 0; i < array.length; i++) {
            int index = hash.hashFunction(array[i]);

            while (hash.table[index] != null) {
                if (hash.table[index].key == array[i]) {
                    return true; // Duplicate found
                }
                index = (index + 1) % hash.length; // Linear probing
            }

            hash.table[index] = new Element(array[i]);
        }

        return false;
    }

}

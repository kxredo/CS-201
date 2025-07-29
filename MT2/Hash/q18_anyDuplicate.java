
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

    boolean anyDuplicate(int[] array) {
        Hash hash = new Hash(array.length);
        for (int value : array) {
            if (hash.search(value) != null) {
                return true; // Duplicate found
            }
            hash.insert(value);
        }
        return false; // No duplicates found
    }

}

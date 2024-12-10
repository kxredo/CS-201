
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
        Hashtable hashTable = new Hashtable(array.length);

        for (int i = 0; i < array.length; i++) {
            int index = hashTable.hashFunction(array[i]);

            while (hashTable.table[index] != null) {
                if (hashTable.table[index].key == array[i]) {
                    return true; // Duplicate found
                }
                index = (index + 1) % hashTable.length; // Linear probing
            }

            hashTable.table[index] = new Element(array[i]);
        }

        return false;
    }

}

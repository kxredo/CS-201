
public class q23_sortByHashing {
/*
int [] sortByHashing(int[] array)
 that takes an array of integers as a parameter (which contains distinct
 numbers less than 2N, where N is the number of elements in the array)
 and returns the sorted version of that array. Your method should run
 in O(N) time. Do not use any external data structures or arrays except
 the resulting array and hash table. Hint: Find the maximum number
 in the array, the sorted array should contain only numbers less than
 that.
 */
    int[] sortByHashing(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        Hash hash = new Hash(max + 1);

        for (int value : array) {
            hash.insert(value);
        }

        int[] sortedArray = new int[array.length];
        int index = 0;

        for (int i = 0; i < hash.table.length; i++) {
            if (hash.table[i] != null) {
                sortedArray[index++] = hash.table[i].getData();
            }
        }
        return sortedArray;
    }
}

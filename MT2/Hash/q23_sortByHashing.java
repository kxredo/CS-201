
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
    public static int[] sortByHashing(int[] array) {
        Hash table = new Hash (2*array.length);
        int max = array[0];
        int [] result = new int[array.length];


        for(int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        for(int i = 0; i < array.length; i++) {
            table.insert(array[i]);
        }
        int index = 0;
        for(int i = 0; i <= max; i++){
            if(table.search(i) != null){
                result[index] = i;
                index++;
            }
        }
        return result;
    }

}

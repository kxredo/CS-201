
public class q28_union {

    /*
 int [] union(int [] list1 , int [] list2 )
 to find the union of the elements in two arrays and return a new array.
 The union array should contain only that many items not more not
 less. Your method should run in O(N) time, where N is the number
 of elements in the arrays. Do not use any external data structures or
 arrays except the resulting array and an external hash table.
     */
    int[] union(int[] list1, int[] list2) {
        Hash hash = new Hash(list1.length + list2.length);
        int count = 0;

        for (int value : list1) {
            if (hash.search(value) == null) {
                hash.insert(value);
                count++;
            }
        }

        for (int value : list2) {
            if (hash.search(value) == null) {
                hash.insert(value);
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int i = 0; i < hash.table.length; i++) {
            if (hash.table[i] != null) {
                result[index++] = hash.table[i].getData();
            }
        }
        return result;
    }
}

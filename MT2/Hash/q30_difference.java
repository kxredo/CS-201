public class q30_difference {
    /*Write a static method in the Hash class (linked list im
plementation)
 int [] difference (int [] list1 , int [] list2 )
 to find the difference of the elements in two arrays and return a new
 array containing all elements from list1 that are not present in list2.
 Your method should run in O(N) time, where N is the total number
 of elements in both arrays. The difference array must contain exactly
 as many elements as needed (no extra or missing elements). You can
 use at most one external hash.
*/
    public static int[] difference(int[] list1, int[] list2) {
        Hash hash = new Hash();
        int index = 0;

        // Insert elements of list2 into the hash table
        for (int num : list2) {
            hash.insert(num);
        }

        // Count elements in list1 that are not in list2
        for (int num : list1) {
            if (!hash.search(num)) {
                index++;
            }
        }

        // Create result array with the correct size
        int[] result = new int[index];
        index = 0;

        // Fill result array with elements from list1 that are not in list2
        for (int num : list1) {
            if (!hash.search(num)) {
                result[index++] = num;
            }
        }

        return result;
    }
}

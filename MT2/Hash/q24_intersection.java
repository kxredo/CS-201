
import java.util.ArrayList;

public class q24_intersection {
// last semester question

    public static int[] intersection(int[] list1, int[] list2) {
        // Create a hash table to store elements from list1
        Hash hashTable = new Hash(list1.length);

        // Step 1: Insert all elements of list1 into the hash table
        for (int i = 0; i < list1.length; i++) {
            hashTable.insert(list1[i]);
        }

        // Step 2: Prepare a dynamic list to store the intersection result
        ArrayList<Integer> resultList = new ArrayList<>();

        // Step 3: Check if elements from list2 exist in the hash table
        for (int i = 0; i < list2.length; i++) {
            if (hashTable.search(list2[i]) != null) {
                resultList.add(list2[i]);
            }
        }

        // Step 4: Convert the result list to an array
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }

}


import java.util.ArrayList;
/*
int [] intersection (int [] list1 , int [] list2 )
 to find the intersection of the elements in two arrays and return a new
 array. Your method should run in O(N) time, where N is the number
 of elements in the arrays. Do not use any external data structures or
 arrays except the resulting array and hash table. The intersection array
 should contain only that many items not more not less. Hint: How can
 you search an element from the first list in the second list in O(1)?
 */
public class q24_intersection {

    public static int[] intersection(int[] list1, int[] list2) {
        // Create a hash table to store elements from list1
        Hash hash = new Hash(list2.length);
        int count = 0;

        for (int i = 0; i < list2.length; i++) {
            hash.insert(list2[i]);
        }


        for (int i = 0; i < list1.length; i++) {
            if (hash.search(list1[i]) != null) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        
        for (int i = 0; i < list1.length; i++) {
            if(hash.search(list1[i])!=null){
                result[index]=list1[i];
                index++;
            }
        }

        return result;
    }

}

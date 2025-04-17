
import java.util.ArrayList;

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

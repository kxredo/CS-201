
import java.util.Hashtable;


public class q18_anyDuplicate {

    public static boolean anyDuplicate(int[] array) {
        int N = array.length;
        Hashtable hashTable = new Hashtable(N);

        for (int value : array) {
            if (hashTable.search(value) != null) {
                return true;
            }
            hashTable.insert(value);
        }
        return false;
    }
}

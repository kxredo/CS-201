
public class q13_undelete {

    public void undelete(int value) {

        int index = hashFunction(value)
        
        for (int i = 0; i < table.length; i++) {
            // If we find the value and it's marked as deleted, undelete it
            if (table[index] != null && table[index].data == value && deleted[index]) {
                deleted[index] = false; // Mark as undeleted
                return;
            }
            if (table[index] == null) {
                return;
            }
        }
    }

}

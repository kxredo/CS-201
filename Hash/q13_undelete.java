
public class q13_undelete {

    public void undelete(int value) {
        int hash = value % N;
        int i = 0;

        while (i < N) {
            int index = (hash + i) % N;

            // If we find the value and it's marked as deleted, undelete it
            if (table[index] != null && table[index].data == value && deleted[index]) {
                deleted[index] = false; // Mark as undeleted
                return;
            }

            // If we encounter an empty slot, the value is not in the hash table
            if (table[index] == null) {
                return;
            }

            i++; // Continue probing
        }
    }

}

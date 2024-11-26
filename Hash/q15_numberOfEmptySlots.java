
public class q15_numberOfEmptySlots {

    public int numberOfEmptySlots() {
        int count = 0;

        // Iterate through the table and count empty (null) or deleted slots
        for (int i = 0; i < table.length; i++) {
            if (table[i] == null || deleted[i]) {
                count++;
            }
        }

        return count;
    }

    public int numberOfEmptySlots() {
        int count = 0;

        // Iterate through the table and count empty (null) linked lists
        for (int i = 0; i < table.length; i++) {
            if (table[i] == null) {
                count++;
            }
        }

        return count;
    }

}

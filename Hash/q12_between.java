
public class q12_between {

    public int between(int X, int Y) {
        int count = 0;

        // Iterate through the entire table to check each element
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) {
                int value = table[i].data;
                // Check if the element is between X and Y (inclusive)
                if (value >= X && value <= Y) {
                    count++;
                }
            }
        }

        return count;
    }

}

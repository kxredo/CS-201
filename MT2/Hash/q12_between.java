
import javax.swing.text.TableView;

public class q12_between {

    /*
Write a function which returns the number of items in the hash table
 whose values are between X and Y. Your method should run in O(N)
 time.
 int between(int X, int Y)
     */
// returns number of values between x and y
    public int between(int X, int Y) {
        int count = 0;

        // Iterate through the entire table to check each element
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) {
                // Check if the element is between X and Y (inclusive)
                if (table[i].data >= X && table[i].data <= Y) {
                    count++;
                }
            }
        }

        return count;
    }
}

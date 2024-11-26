
public class q14_minimum {

    public Element<T> minimum() {
        Element<T> min = null;

        // Iterate through the entire table
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) {
                // If min is null or current element is smaller than min, update min
                if (min == null || (table[i].data < min.data)  {
                    min = table[i];
                }
            }
        }

        return min;
    }

}

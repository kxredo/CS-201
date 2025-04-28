
public class q14_minimum {

    public Element<T> minimum() {
        Element<T> min = null;

        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) {
                if (table[i].data < min.data) {
                    min = table[i];
                }
            }
        }
        return min;
    }

}

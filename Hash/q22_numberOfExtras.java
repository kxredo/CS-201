
public class q22_numberOfExtras {

    static int numberOfExtras(int[] array) {
        Hash table = new Hash(array.length);
        int extras = 0;
        for (int i = 0; i < array.length; i++) {
            if (table.search(array[i]) != null) {
                extras++;
            } else {
                table.insert(array[i]);
            }
        }
        return extras;
    }

}

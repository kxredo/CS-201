
public class q8_search {

    public Element search(int value) {
        int i = 0;
        int hashValue = value % table.length;

        while (i < table.length) {
            if (table[hashValue] == null) {
                return null; // Key not found
            } else if (table[hashValue].getKey() == value) {
                return table[hashValue]; // Key found
            }
            i++;
        }
        return null; // Key not found after probing
    }

}

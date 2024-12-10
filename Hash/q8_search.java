
public class q8_search {
/*
In open addressing, write a function that searches a key value in the
hash table with quadratic probing as the collision resolution strategy.
Element search(int value)
 */
    public Element search(int value) {
        int i = 0;
        int index = hashFunction(value);

        while (i < table.length) {
            if (table[index] == null) {
                return null; // Key not found
            } else if (table[index].getKey() == value) {
                return table[index]; // Key found
            }
            i++;
        }
        return null; // Key not found after probing
    }

}

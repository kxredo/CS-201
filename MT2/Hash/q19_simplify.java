
public class q19_simplify {

    /*
Write a method that simplifies a hash table by creating a new hash
 table containing elements from the original hash table, where
 For single occurrence of a value, copy that value to the new table
 For multiple occurrences of that value, copy that value only once
 to the new table
 Write the function both array and linked list implementations. You are
 allowed to use linked list and hashing methods.
 Hash simplify()
     */
    public Hash simplify() {
        Hash newTable = new Hash(table.length);
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) {
                int count = 0;
                int index = hashFunction(table[i].key);

                while (newTable.table[index] != null) {
                    if (newTable.table[index].key == table[i].key) {
                        count++;
                        break;
                    }
                    index = (index + 1) % newTable.table.length;
                }

                if (count == 0) {
                    newTable.table[index] = new Element(table[i].key);
                }
            }
        }
        return newTable;
    }

}

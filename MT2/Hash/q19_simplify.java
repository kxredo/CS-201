
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
        Hash hash = new Hash(table.length);
        int count = 0;

        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) {
                int index = hashFunction(table[i].key);

                while (hash.table[index] != null) {
                    if (hash.table[index].key == table[i].key) {
                        count++;
                        break;
                    }
                    index = (index + 1) % hash.table.length;
                }

                if (count == 0) {
                    hash.table[index] = new Element(table[i].key);
                }
            }
        }
        return hash;
    }

}

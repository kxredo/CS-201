
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
    Hash simplify() {
        Hash hash = new Hash(table.length);
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) {
                int value = table[i].getData();
                if (hash.search(value) == null) {
                    hash.insert(value);
                }
            }
        }
        return hash;
    }

}

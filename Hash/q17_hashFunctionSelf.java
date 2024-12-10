
public class q17_hashFunctionSelf {

    /*
Write an hash function that maps the key values in an hash table into
 an hash value. Assume that the hash value of an hash table can be
 obtained first by summing up the key values of the elements in the
 hash table and then hashing the sum. Write the function for array im
plementation. Assume also that linear probing is used as the collision
 strategy. Do not use any class or external methods except hashFunc
tion.
 int hashFunctionItSelf ()
     */
    public int hashFunctionItSelf() {
        int sum = 0;

        // Sum up all key values in the hash table
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) {
                sum += table[i].data;  // Assuming table[i].data contains the key value
            }
        }

        return hashFunction(sum);
    }

}

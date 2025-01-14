
public class q9_loadFactor {
/*
Write a function that computes the load factor of an hash table implemented with a fixed array. 
The load factor of a hash table is the ratio of the number of elements in the hash table to the table size.
double loadFactor()
 */
    public double loadFactor() {
        int elementCount = 0; // Counter for the number of elements in the hash table
        int tableSize = table.length; // Total size of the hash table

        // Iterate through the hash table to count non-empty slots
        for (int i = 0; i < tableSize; i++) {
            if (table[i] != null) {
                elementCount++;
            }
        }

        // Compute and return the load factor
        return (double) elementCount / tableSize;
    }

}

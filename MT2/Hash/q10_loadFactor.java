
import org.w3c.dom.Node;

public class q10_loadFactor {
/*
Write a function that computes the load factor of an hash table imvplemented with an array of linked lists (Separate chaining). 
The load factor of a hash table is the ratio of the number of elements in the hash table to the table size.
double loadFactor()
 */
    public double loadFactor() {
        int elementCount = 0; // Total number of elements in the hash table
        int tableSize = table.length; // Total number of buckets in the hash table

        // Iterate through each bucket in the hash table
        for (int i = 0; i < tableSize; i++) {
            Node current = table[i]; // Head of the linked list in the current bucket
            while (current != null) {
                elementCount++; // Count each element in the linked list
                current = current.next;
            }
        }

        // Compute and return the load factor
        return (double) elementCount / tableSize;
    }

}

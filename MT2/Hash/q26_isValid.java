
import java.util.LinkedList;

import org.w3c.dom.Node;
/*
 Write the method in Hash class linked list implementation
 boolean isValid()
 that checks if the hash table is valid or not. An hash table is invalid if
 it contains the same number twice. Your method should run in O(N)
 time. Do not use external data structures or hash tables.
 */

public class q26_isValid {

    public boolean isValid() {
        for (int i = 0; i < table.length; i++) {
            Node current = table[i];
            while (current != null) {
                Node runner = current.next;
                while (runner != null) {
                    if (runner.data == current.data) {
                        return false; // Duplicate found
                    }
                    runner = runner.next;
                }
                current = current.next;
            }
        }
        return true; // No duplicates found
    }
}

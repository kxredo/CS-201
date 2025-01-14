
import java.util.LinkedList;

import org.w3c.dom.Node;

/*
Write a function that finds the maximum element in an hash table 
where collision solving strategy is separate chaining.
Node maximum()
 */
public class q7_maximum {

    public Node maximum() {
        Node max = null;

        // Iterate through each bucket in the hash table
        for (int i = 0; i < table.length; i++) {
            Node current = table[i];

            // Traverse the linked list in the current bucket
            while (current != null) {
                if (max == null || current.data > max.data) {
                    max = current; // Update maxNode if current node is larger
                }
                current = current.next;
            }
        }

        return max;
    }

}

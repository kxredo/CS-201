
import java.util.LinkedList;

import org.w3c.dom.Node;

public class q7_maximum {

    public Node maximum() {
        Node maxNode = null;

        // Iterate through each bucket in the hash table
        for (int i = 0; i < table.length; i++) {
            Node current = table[i];

            // Traverse the linked list in the current bucket
            while (current != null) {
                if (maxNode == null || current.data > maxNode.data) {
                    maxNode = current; // Update maxNode if current node is larger
                }
                current = current.next;
            }
        }

        return maxNode;
    }

}

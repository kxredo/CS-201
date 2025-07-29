
import java.util.LinkedList;

import org.w3c.dom.Node;

/*
Write an hash function that maps a linked list into an hash value.
 Assume that the hash value of a linked list can be obtained first by
 summing up the key values of the nodes in the linked list and then
 hashing thesum.
 */
public class q2_hashFunction {

    public int hashFunction(LinkedList l) {
        int sum = 0;
        Node current = l.head; // Traverse the input linked list
        while (current != null) {
            sum += current.key; // Sum up the key values
            current = current.next;
        }
        return hashFunction(sum); // Use the existing hash function for the sum
    }
}

}

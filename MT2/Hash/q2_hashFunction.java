
import java.util.LinkedList;

import org.w3c.dom.Node;

/*
Write anhash function thatmaps a linked list intoanhashvalue.
 Assume that thehashvalueof a linked list canbeobtainedfirstby
 summingupthekeyvaluesof thenodes inthe linked list andthen
 hashingthesum.
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

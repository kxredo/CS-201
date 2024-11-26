import java.util.LinkedList;

import org.w3c.dom.Node;

public class q2_hashFunction {
    public int hashFunction(LinkedList l) {
    int sum = 0;
    
    // Traverse through the linked list and sum up the key values
    Node current = l.head;  // Assuming `head` is the first node in the linked list
    while (current != null) {
        sum += current.key;  // Assuming `key` is the value stored in the node
        current = current.next;  // Move to the next node
    }
    
    // Hash the sum by taking the modulo with a prime number or the table size
    return sum % N;  // 997 is a prime number (you can use a different prime number or table size)
}

}

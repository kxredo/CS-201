package LinkedLists;

public class Q41_deleteEven {
    void deleteEven() {
        Node current = head; // Pointer to traverse the linked list
        Node prev = null; // Pointer to keep track of the previous node

        while (current != null) {
            if (current.data % 2 == 0) { // Check if the current node's value is even
                if (prev == null) {
                    // If the current node is the head, update head to the next node
                    head = current.next;
                } else {
                    // Bypass the current node if it's not the head
                    prev.next = current.next;
                }
                // Move to the next node
                current = current.next; // Continue with the next node
            } else {
                // Move both current and prev pointers forward if the current node's value is odd
                prev = current;
                current = current.next;
            }
        }
}
}

package LinkedLists;

public class Q41_deleteEven {
    void deleteEven() {
        Node current = head; // Pointer to traverse the linked list
        Node prev = null; // Pointer to keep track of the previous node

        while (current != null) {
            if (current.data % 2 == 0) { // Check if the current node's value is even
                if (prev == null) {
                    head = current.next;
                } else {
                    prev.next = current.next;
                }
                current = current.next; // Continue with the next node
            } else {
                // Move both current and prev pointers forward if the current node's value is odd
                prev = current;
                current = current.next;
            }
        }
}
}

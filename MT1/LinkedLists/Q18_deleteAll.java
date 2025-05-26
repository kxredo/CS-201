package LinkedLists;

public class Q18_deleteAll {

    /*
Write a function that deletes all nodes having value X from a singly linked list.
void deleteAll (int X)
     */
    void deleteAll(int X) {
        // Remove all occurrences at the head
        while (head != null && head.data == X) {
            head = head.next;
        }
        Node current = head;

        // Traverse and remove matching nodes
        while (current != null && current.next != null) {
            if (current.next.data == X) {
                current.next = current.next.next; // Skip the node with value X
            } else {
                current = current.next;
            }
        }
    }
}

}

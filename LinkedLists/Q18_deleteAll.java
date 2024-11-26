package LinkedLists;

public class Q18_deleteAll {

    /*
Write a function that deletes all nodes having value X from a singly linked list.
void deleteAll (int X)
     */
    void deleteAll(int X) {
        Node current = head;
        Node previous = null;

        // Traverse the list and delete nodes with value X
        while (current != null) {
            if (current.data == X) {
                if (previous == null) {
                    head = current.next; // Update head if the node to delete is the head
                } else {
                    previous.next = current.next; // Skip the current node
                }
            } else {
                previous = current; // Update previous only if no deletion
            }
            current = current.next; // Move to the next node
        }
    }

}

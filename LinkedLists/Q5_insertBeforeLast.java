package LinkedLists;

public class Q5_insertBeforeLast {

    /*
Write a function that will add a new node before the last node of a singly linked list.
void insertBeforeLast (Node newNode)
     */
    void insertBeforeLast(Node newNode) {
        if (head == null) {
            return; // Check if the list is empty
        }
        Node current = head;
        Node previous = null;

        // Traverse the list to find the last node
        while (current.next != null) {
            previous = current; // Keep track of the current node
            current = current.next; // Move to the next node
        }

        // Insert the new node before the last node
        if (previous != null) {
            previous.next = newNode; // Link the new node
            newNode.next = current; // Link the last node to the new node
        }
    }

}

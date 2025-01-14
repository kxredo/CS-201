package LinkedLists;

public class Q15_reverse {

    /*
Write a function that will return the reverse of a singly link list.
LinkedList reverse ()
     */

    LinkedList reverse() {
        LinkedList reversedList = new LinkedList(); // Create a new linked list to store the reversed nodes
        Node current = head; // Start with the head of the original list

        // Traverse the original linked list
        while (current != null) {
            Node newNode = new Node(current.data); // Create a new node with the current data
            newNode.next = reversedList.head; // Link the new node to the current head of the reversed list
            reversedList.head = newNode; // Update the head of the reversed list to the new node
            current = current.next; // Move to the next node in the original list
        }

        return reversedList; // Return the new linked list containing the reversed nodes
    }

}

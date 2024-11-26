package LinkedLists;

public class Q3_oddIndexedElements {

    /*
Write a function that will delete the odd indexed elements from a singly
 linked list. The function will also return the deleted nodes as a new
 linked list.
 LinkedList oddIndexedElements()
     */
    LinkedList oddIndexedElements() {
        LinkedList deletedNodesList = new LinkedList();
        while (head != null) {
            Node current = head;
            Node previous = null;
            int index = 0;
        }

        while (current != null) {
            if (index % 2 != 0) { // Check for odd index
                deletedNodesList.add(current.data); // Add to deleted nodes list
                previous.next = current.next; // Bypass the current node
            } else {
                previous = current; // Move previous pointer only if we do not delete the node
            }
            current = current.next; // Move to the next node
            index++;
        }

        return deletedNodesList; // Return the list of deleted nodes
    }

}

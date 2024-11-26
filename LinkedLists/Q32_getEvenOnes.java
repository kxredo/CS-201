package LinkedLists;

public class Q32_getEvenOnes {

    /*
Write a method for doubly linked lists, which returns a new doubly
 linked list with even indexed nodes (2, 4, ...) from the original list.
 Your linked list should contain new nodes, not the same nodes in the
 original linked list. The first node has index 1. You are not allowed to
 use any linked list methods, just attributes, constructors, getters and
 setters.
 DoublyLinkedList getEvenOnes()
     */
    DoublyLinkedList getEvenOnes() {
        DoublyLinkedList evenList = new DoublyLinkedList(); // New list to store even indexed nodes
        Node current = head; // Start with the head of the original list
        int index = 1; // Initialize index

        while (current != null) {
            if (index % 2 == 0) { // Check if the index is even
                Node newNode = new Node(current.data); // Create a new node with the current node's data
                if (evenList.head == null) {
                    evenList.head = newNode; // Set the head of the new list
                } else {
                    Node last = evenList.head;
                    while (last.next != null) {
                        last = last.next; // Traverse to the last node of the new list
                    }
                    last.next = newNode; // Link the new node to the last node
                    newNode.prev = last; // Set the previous pointer for the new node
                }
            }
            current = current.next; // Move to the next node in the original list
            index++; // Increment index
        }

        return evenList; // Return the new list with even indexed nodes
    }

}

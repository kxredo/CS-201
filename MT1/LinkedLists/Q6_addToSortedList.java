package LinkedLists;

public class Q6_addToSortedList {

    /*
Given a sorted linked list, write a function to add a new integer without destroying the sortedness property.
void AddToSortedList(int x)
     */
    void AddToSortedList(int x) {
        Node newNode = new Node(x);

        // If the list is empty or the new node should be the new head
        if (head == null || head.data >= x) {
            newNode.next = head;
            head = newNode; // Update head to the new node
            return;
        }

        Node current = head;

        // Traverse the list to find the correct position for the new node
        while (current.next != null && current.next.data < x) {
            current = current.next; // Move to the next node
        }

        // Insert the new node in the correct position
        newNode.next = current.next; // Link the new node
        current.next = newNode; // Link previous node to the new node
    }

}

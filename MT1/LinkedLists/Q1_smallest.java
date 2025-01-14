package LinkedLists;

public class Q1_smallest {

    /*
Write a function that will find the smallest number in a singly linked
 list.
 int smallest()
     */
    int smallest() {
    
        Node current = head; // Start with head
        int min = current.data; // Initialize min with the first element

        while (current != null) { // traverse linked list
            if (current.data < min) {
                min = current.data; // Update min if a smaller value is found
            }
            current = current.next; // Move to the next node
        }

        return min; // Return the smallest value found
    }

}

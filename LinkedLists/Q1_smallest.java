package LinkedLists;

public class Q1_smallest {

    /*
Write a function that will find the smallest number in a singly linked
 list.
 int smallest()
     */
    int smallest() {
        if (isEmpty()) {
            return Integer.MAX_VALUE; // Return a large value if the list is empty
        }
        Node current = head; // Assuming 'head' is the first node in the linked list
        int min = current.data; // Initialize min with the first element

        while (current != null) {
            if (current.data < min) {
                min = current.data; // Update min if a smaller value is found
            }
            current = current.next; // Move to the next node
        }

        return min; // Return the smallest value found
    }

}

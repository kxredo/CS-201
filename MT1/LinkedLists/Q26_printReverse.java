package LinkedLists;

public class Q26_printReverse {

    /*
Write the method which prints the contents of the linked list in reverse
 order. You are not allowed to use any array variable.
 void printReverse ()
     */
    void printReverse() {
        Node current = head;

        // Traverse to the end of the linked list
        while (current != null && current.next != null) {
            current = current.next;
        }

        // Print in reverse order by traversing backward
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev; // Move to the previous node
        }
    }

}
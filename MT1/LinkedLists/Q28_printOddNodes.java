package LinkedLists;

public class Q28_printOddNodes {

    /*
Write the method which prints the contents of the odd indexed nodes
(1, 3, ...) in the linked list.
void printOddNodes()
     */
    void printOddNodes() {
        Node current = head;
        int index = 1; // Start with index 1

        // Traverse the linked list
        while (current != null) {
            if (index % 2 != 0) { // Check if the index is odd
                System.out.print(current.data + " "); // Print the data of odd indexed nodes
            }
            current = current.next; // Move to the next node
            index++; // Increment the index
        }
    }

}

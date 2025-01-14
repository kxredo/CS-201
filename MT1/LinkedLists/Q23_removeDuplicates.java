package LinkedLists;

public class Q23_removeDuplicates {

    /*
Suppose you are given a linked list of N integers that are sorted. Write an algorithm to remove duplicate elements from that sorted linked list.
void removeDuplicates(LinkedList A)
     */
    void removeDuplicates(LinkedList A) {
        Node current = A.head;

        // Traverse the list and remove duplicates
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next; // Skip the duplicate node
            } else {
                current = current.next; // Move to the next distinct node
            }
        }
    }

}

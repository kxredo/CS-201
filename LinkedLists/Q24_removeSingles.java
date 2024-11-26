package LinkedLists;

public class Q24_removeSingles {

    /*
Suppose you are given a linked list of N integers that are sorted. Write
 an algorithm to remove single elements from that sorted linked list.
 void removeSingles(LinkedList A)
     */
    void removeSingles(LinkedList A) {
        Node dummy = new Node(0); // Dummy node to handle edge cases
        dummy.next = A.head;
        Node prev = dummy;
        Node current = A.head;

        while (current != null) {
            boolean isSingle = false;

            // Check if current node is a single (not part of duplicates)
            while (current.next != null && current.data == current.next.data) {
                current = current.next;
                isSingle = true;
            }

            if (isSingle) {
                prev.next = current.next; // Remove the group of duplicates
            } else {
                prev = prev.next; // Move prev pointer to current
            }

            current = current.next; // Move to the next node
        }

        A.head = dummy.next; // Update the head in case the first node(s) were removed
    }

}

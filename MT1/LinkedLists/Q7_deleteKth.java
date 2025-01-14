package LinkedLists;

public class Q7_deleteKth {

    /*
Write a function to delete k’th node from a singly linked list.
void deleteKth(int k)
     */
    void deleteKth(int k) {
        if (head == null || k <= 0) {
            return; // Check if the list is empty or k is invalid
        }
        Node current = head;

        // If the head needs to be removed
        if (k == 1) {
            head = current.next; // Update head to the next node
            return;
        }

        // Traverse the list to find the (k-1)th node
        for (int i = 1; current != null && i < k - 1; i++) {
            current = current.next; // Move to the next node
        }

        // If the (k-1)th node is found and the kth node exists
        if (current != null && current.next != null) {
            current.next = current.next.next; // Bypass the kth node
        }
    }

}

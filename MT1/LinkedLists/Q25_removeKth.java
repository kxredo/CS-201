package LinkedLists;

public class Q25_removeKth {

    /*
Write a method which deletes K’th node from a doubly linked list.
void removeKth(int K)
     */
    void removeKth(int K) {

        DoubleNode current = head;
        int count = 1;

        // Traverse the list to find the K'th node
        while (current != null && count < K) {
            current = current.next;
            count++;
        }
        // Adjust pointers to remove the current node
        if (current.prev != null) {
            current.prev.next = current.next; // Bypass the current node
        } else {
            head = current.next; // Update head if the first node is removed
        }

        if (current.next != null) {
            current.next.prev = current.prev; // Bypass the current node
        }
    }

}

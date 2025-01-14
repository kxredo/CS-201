package LinkedLists;

public class Q43_removeKthBeforeLast {

    /*
     void removeKthBeforeLast(int K)
 which removes the K’th element from the end of the double linked list.
 If K = 1, last element will be deleted. If K = N, first element will be
 deleted. First count the number of elements in the list, i.e. N, then
 handle special cases K = 1, and K = N, then do the rest. You are not
 allowed to use any doubly linked list methods. You are allowed to use
 attributes, constructors, getters and setters.
     */
    // Find the K'th element from the end
    void removeKthBeforeLast(int K) {
        Node current = head;
        for (int i = 1; i < count - K; i++) {
            current = current.next; // Move to the target node
        }

        // Adjust the pointers to remove the node
        if (current.prev != null) {
            current.prev.next = current.next; // Link previous node to next
        }
        if (current.next != null) {
            current.next.prev = current.prev; // Link next node to previous
        }
    }
}

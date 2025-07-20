package LinkedLists;

public class Q43_removeKthBeforeLast {

    /*
     void removeKthBeforeLast(int K)
 which removes the K’th element from the end of the double linked list.
 If K = 1, last element will be deleted. If K = N, first element will be
 deleted. 
 First count the number of elements in the list, i.e. N, 
 then handle special cases K = 1, and K = N, then do the rest. You are not
 allowed to use any doubly linked list methods. You are allowed to use
 attributes, constructors, getters and setters.
     */
    // Find the K'th element from the end
    void removeKthBeforeLast(int K) {
        // Step 1: Count the number of elements (N)
        int N = 0;
        Node current = head;
        while (current != null) {
            N++;
            current = current.next;
        }
        // Step 2: Handle special cases
        if (K == N) {
            // Remove first node
            if (head != null) {
                head = head.next;
                if (head != null) head.prev = null;
            }
            return;
        }
        if (K == 1) {
            // Remove last node
            current = head;
            while (current.next != null) current = current.next; // move to last node
            if (current.prev != null)
                current.prev.next = null;
            else
                head = null; // only one node
            return;
        }
        int pos = N - K + 1;
        current = head;
        for (int i = 1; i < pos; i++) {
            current = current.next;
        }
        if (current.prev != null)
            current.prev.next = current.next;
        if (current.next != null)
            current.next.prev = current.prev;
    }
}

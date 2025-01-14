package LinkedLists;

public class Q10_middle {

    /*
Write a function to find the middle node of a doubly linked list.
DoubleNode middle()
     */
    DoubleNode middle() {
        if (head == null) {
            return null; // Return null if the list is empty
        }
        DoubleNode slow = head; // Slow pointer
        DoubleNode fast = head; // Fast pointer

        // Move fast pointer two steps and slow pointer one step
        while (fast != null && fast.next != null) {
            slow = slow.next; // Move slow pointer by one
            fast = fast.next.next; // Move fast pointer by two
        }

        return slow; // Slow pointer will be at the middle node
    }

}

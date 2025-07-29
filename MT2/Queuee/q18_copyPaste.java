package Queuee;

import java.util.Queue;

/*
Write the method for array implementation
 void copyPaste(Queue src, int index)
 which copies all the elements of the src queue and inserts to the queue at
 position index. You are not allowed to use enqueue, dequeue, isEmpty
 functions. You can assume the destination queue has enough space
 for insertion. Your method should run in O(N) time. Hint: Start by
 counting the number of positions to shift for opening up space for the
 elements of src.
 */
public class q18_copyPaste {

    public void copyPaste(Queue src, int index) {

        int count = (last - first + N) % N; // Number of elements in the queue

        for (int i = count - 1; i >= index; i--) {
            array[(first + i + src.last - src.first) % N] = array[(first + i) % N];
        }

        for (int i = 0; i < src.last - src.first; i++) {
            array[(first + index + i) % N] = new Element(src.array[(src.first + i) % src.N]); // Recreate element
        }
        last = (last + (src.last - src.first)) % N; // Update last pointer
    }

    // Linked List
    public void copyPaste(Queue src, int index) {
        Node current = src.first;
        Node previous = null;
        int count = 0;

        while (current != null && count < index) {
            previous = current;
            current = current.getNext();
            count++;
        }

        if (previous != null) {
            previous.setNext(src.first); // Link previous part to src
        } else {
            first = src.first; // If index is 0, set first to src's first
        }

        if (src.last != null) {
            last = src.last; // Update last to src's last
        }

        if (current != null) {
            last.setNext(current);
        }
    }
}

package Queuee;

import java.util.Queue;

public class q20_cutPaste {

    /*
Write the method for array implementation
 void cutPaste(Queue dest, int p, int q)
 which cuts all the elements between indexes p and q from the original
 queue and inserts at the end to the dest queue. You are not allowed to
 use enqueue, dequeue, isEmpty functions. You can assume the desti
nation queue has enough space for insertion. Your method should run
 in O(N) time.
     */
    void cutPaste(Queue dest, int p, int q) {

        int count = (last - first + N) % N; // Number of elements in the queue

        for (int i = p; i <= q; i++) {
            Element element = new Element(array[(first + i) % N]); // Recreate element
            dest.enqueue(element);
        }
    }














    //Linked List
    public void cutPaste(Queue dest, int p, int q) {
        Node current = first;
        Node previous = null;
        int index = 0;

        while (current != null && index < p) {
            previous = current;
            current = current.getNext();
            index++;
        }

        Node startCut = current; // Start of the cut
        while (current != null && index <= q) {
            current = current.getNext();
            index++;
        }

        if (previous != null) {
            previous.setNext(current); // Link previous part to the end of the cut
        } else {
            first = current; // If p was 0, update first
        }

        if (dest.isEmpty()) {
            dest.first = startCut; // If destination is empty, set first
        } else {
            dest.last.setNext(startCut); // Link to the end of destination
        }

        dest.last = startCut; // Update last of destination
    }

}

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
        for (int i = p; i <= q; i++) {
            dest.array[dest.rear] = array[i];
            dest.rear = (dest.rear + 1) % dest.size;
        }

        int shift = q - p + 1;
        for (int i = p; i < rear; i++) {
            array[i] = array[i + shift];
        }

        rear = (rear - shift + size) % size;
    }

}

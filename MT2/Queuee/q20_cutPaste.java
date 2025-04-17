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

    //Linked List
    public void cutPaste(Queue dest, int p, int q) {
        Node current = head;
        Node prev = null;
    
        for (int i = 1; i < p; i++) {
            prev = current;
            current = current.next;
        }
    
        Node start = current;
        for (int i = p; i < q; i++) {
            current = current.next;
        }
        Node end = current;
        Node afterEnd = end.next;
    
        if (prev != null) {
            prev.next = afterEnd;
        } 
    
        // Attach the detached sublist [p, q] to the end of the destination queue
        if (dest.tail != null) {
            dest.tail.next = start;
        } else {
            // If the destination queue is empty, update its head
            dest.head = start;
        }
        dest.tail = end;
    
        // Update the size of both queues
        dest.size += (q - p + 1);
        this.size -= (q - p + 1);
    
        // Ensure the detached sublist's tail points to null
        end.next = null;
    }

}

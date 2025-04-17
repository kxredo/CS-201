package Queuee;

import org.w3c.dom.Node;

public class q17_dequeue {

    // Array Implementation
    public Element dequeue(int k) {

        // Get the element to be dequeued
        Element dequeuedElement = array[front + k - 1];

        // Shift all elements after the k-th element to the left
        for (int i = front + k - 1; i < front + size - 1; i++) {
            array[i] = array[i + 1];
        }

        // Update the size
        size--;

        return dequeuedElement;
    }

    // Linked List Implementation
    public Node dequeue(int k) {
        Node dequeuedNode;

        // Traverse to the (k-1)-th node
        Node current = head;
        for (int i = 1; i < k - 1; i++) {
            current = current.next;
        }
        // Remove the k-th node
        dequeuedNode = current.next;
        current.next = current.next.next;
    }
    // Update size
    size--;
    
    return dequeuedNode ;
}
}

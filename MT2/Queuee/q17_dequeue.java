package Queuee;

import org.w3c.dom.Node;

public class q17_dequeue {

    // Array Implementation
    public Element dequeue(int k) {
        if (k < 1 || k > size) {
            throw new IllegalArgumentException("Invalid index k");
        }

        Element element = array[(first + k - 1) % N];

        // Shift elements to the left, starting from the (k+1)-th position
        for (int i = (first + k) % N; i <= last; i++) {
            array[(i - 1) % N] = array[i % N];
        }

        last = (last - 1) % N;
        size--;

        return element;
    }

    // Linked List Implementation
    public Node dequeue(int k) {
        if (k < 1 || k > size) {
            throw new IllegalArgumentException("Invalid index k");
        }

        Node current = first;
        Node prev = null;

        for (int i = 0; i < k - 1; i++) {
            prev = current;
            current = current.next;
        }

        Node removedNode = current;
        if (prev == null) {
            first = current.next;
        } else {
            prev.next = current.next;
        }

        size--;
        return removedNode;
    }
}

package Queuee;

import org.w3c.dom.Node;

public class q17_dequeue {

    /*
 Write the methods
 Element dequeue(int k), Node dequeue(int k)
 which dequeues data as the k’th element from the first. dequeue(1) is
 equal to the original dequeue, that is, the first element has index 1.
 You are not allowed to use any queue methods and any external struc
tures (arrays, queues, trees, etc). You are allowed to use attributes,
 constructors, getters and setters. Write the method for both array and
 linked list implementations.
     */
    public Element dequeue(int k) {

        int index = (first + k - 1) % N; // Calculate the index to dequeue
        Element element = array[index]; // Get the element to dequeue

        // Shift elements to fill the gap
        for (int i = index; i != last; i = (i + 1) % N) {
            array[i] = array[(i + 1) % N];
        }
        last = (last - 1 + N) % N; // Update last pointer
        return element;
    }

    // Linked List Implementation
    public Node dequeue(int k) {

        Node current = first;
        Node previous = null;
        int index = 1; // Start from 1 for the first element

        while (current != null && index < k) {
            previous = current;
            current = current.getNext();
            index++;
        }

        if (previous != null) {
            previous.setNext(current.getNext()); // Bypass the current node
        } else {
            first = current.getNext(); // If k is 1, update first
        }

        if (current == last) {
            last = previous; // If we removed the last element, update last
        }

        return current; // Return the dequeued node
    }
}

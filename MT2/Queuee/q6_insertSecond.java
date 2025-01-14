package Queuee;

import org.w3c.dom.Node;

import stackss.Element;

public class q6_insertSecond {

/*
Write a function that adds a new element after the front element of the
 queue. Write the function for both array and linked list implementa
tions.
 void insertSecond(Element newElement)
 */
    // Array Implementation
    public void insertSecond(Element newElement) {
        if (isFull()) {
            // Handle the case where the queue is full
            // You can either resize the queue or throw an exception
            throw new IllegalStateException("Queue is full");
        }
    
        // Shift elements to the right, starting from the last
        for (int i = last - 1; i >= first; i--) {
            array[i] = array[(i - 1 + N) % N];
        }
    
        // Insert the new element after the front
        array[(first + 1) % N] = newElement;
        last = (last + 1) % N;
        size++;
    }
    // Linked List Implementation
    public void insertSecond(Element newElement) {
        if (isEmpty()) {
            enqueue(newElement);
        } else {
            Node newNode = new Node(newElement);
            newNode.next = first.next;
            first.next = newNode;
            size++;
        }
    }
}

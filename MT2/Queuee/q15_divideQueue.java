package Queuee;

import java.util.Queue;

import org.w3c.dom.Node;

public class q15_divideQueue {

    public Queue divideQueue() {
        Queue newQueue = new Queue(N);
        int originalFirst = first;
        int originalLast = last;

        // Traverse the queue and move even indexed elements to the new queue
        for (int i = 1; first != originalLast; i++) {
            Element currentElement = array[first];
            first = (first + 1) % N;
            if (i % 2 == 0) {
                newQueue.array[newQueue.last] = currentElement;
                newQueue.last = (newQueue.last + 1) % N;
            } else {
                array[last] = currentElement;
                last = (last + 1) % N;
            }
        }

        // Restore the original queue's first and last pointers
        first = originalFirst;
        last = originalFirst + ((originalLast - originalFirst + N) % N + 1) / 2;

        return newQueue;
    }

    // Linked List Implementation
    public Queue divideQueue() {
        Queue newQueue = new Queue();
        Node current = first;
        Node previous = null;
        int index = 1;

        while (current != null) {
            if (index % 2 == 0) {
                Node nextNode = current.getNext();
                if (previous != null) {
                    previous.setNext(nextNode);
                }
                if (current == last) {
                    last = previous;
                }
                newQueue.enqueue(current);
                current.setNext(null);
                current = nextNode;
            } else {
                previous = current;
                current = current.getNext();
            }
            index++;
        }

        return newQueue;
    }
}

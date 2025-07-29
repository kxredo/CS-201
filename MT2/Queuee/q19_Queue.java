package Queuee;

import java.util.Queue;

import org.w3c.dom.Node;

/*
Write another constructor method
 void Queue(Queue[] list)
 which constructs a new list based queue by concatenating all elements
 in the list of queues in order. The elements from queues should be
 recreated (not copied from the queues). You are not allowed to use
 enqueue, dequeue, isEmpty functions. You should solve the question
 for list implementation.
 */
public class q19_Queue {

    public Queue(Queue[] list) {
        for (Queue q : list) {
            if (!q.isEmpty()) {
                if (first == null) {
                    first = q.first; // Set first if it's empty
                } else {
                    last.setNext(q.first); // Link to the end of the current queue
                }
                last = q.last; // Update last to the last of the current queue
            }
        }
    }
}

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
        for (Queue queue : list) {
            Node current = queue.first;
            while (current != null) {
                Node newNode = new Node(current.data);
                if (first == null) {
                    first = newNode;
                    last = newNode;
                } else {
                    last.next = newNode;
                    last = newNode;
                }
                current = current.next;
                size++;
            }
        }
    }
}

package Queuee;
// this question will not come
import java.util.Queue;

import org.w3c.dom.Node;

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

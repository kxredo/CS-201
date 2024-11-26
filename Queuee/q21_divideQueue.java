package Queuee;

import java.util.Queue;

import org.w3c.dom.Node;

public class q21_divideQueue {

    public Queue[] divideQueue(int k) {

        Queue[] queues = new Queue[k];
        for (int i = 0; i < k; i++) {
            queues[i] = new Queue();
        }

        Node current = first;
        int index = 0;
        int count = 0;

        while (current != null) {
            Node newNode = new Node(current.data);
            if (queues[index].first == null) {
                queues[index].first = newNode;
                queues[index].last = newNode;
            } else {
                queues[index].last.next = newNode;
                queues[index].last = newNode;
            }
            queues[index].size++;

            count++;
            if (count == size / k) {
                index++;
                count = 0;
            }
            current = current.next;
        }

        return queues;
    }
}

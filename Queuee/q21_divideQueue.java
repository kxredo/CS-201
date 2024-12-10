package Queuee;

import java.util.Queue;

import org.w3c.dom.Node;

public class q21_divideQueue {

    Queue[] divideQueue(int k) {
        Queue[] result = new Queue[k];
        for (int i = 0; i < k; i++) {
            result[i] = new Queue();
        }

        Node current = first;
        int index = 0;

        while (current != null) {
            Node newNode = new Node(current.key, null);

            if (result[index].first == null) {
                result[index].first = newNode;
                result[index].last = newNode;
            } else {
                result[index].last.next = newNode;
                result[index].last = newNode;
            }

            current = current.next;
            index = (index + 1) % k;
        }

        return result;
    }

}

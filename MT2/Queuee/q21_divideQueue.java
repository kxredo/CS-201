package Queuee;
/*
/*
    Write the method
 Queue[] divideQueue(int k)
 which constructs an array of list based queues by dividing the origi
nal queue into k equal parts. The first, second, ..., k’th element of
 the original queue will be the first element of the first, second, ..., k’th
 output queues, etc. The elements of the output queues should be recre
ated (not copied from the original queue). You are not allowed to use
 enqueue, dequeue, isEmpty functions. You should solve the question
 for list implementation.
     */
import java.util.Queue;

import org.w3c.dom.Node;

public class q21_divideQueue {

    public Queue[] divideQueue(int k) {
        int count = (last - first + N) % N; // Number of elements in the queue
        int partSize = count / k; // Size of each part
        Queue[] queues = new Queue[k];
        for (int i = 0; i < k; i++) {
            queues[i] = new Queue(partSize);
        }

        for (int i = 0; i < count; i++) {
            int queueIndex = i % k;
            Element element = new Element(array[(first + i) % N]); // Recreate element
            queues[queueIndex].enqueue(element);
        }
        return queues;
    }

}

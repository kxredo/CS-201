package Queuee;

import stackss.Stack;

public class q4_largest {

    /*
Write a function that returns the maximum element in a queue. You are
 only allowed to use enqueue, dequeue, isEmpty functions. The queue
 must contain the same elements in the same order after the execution
 of this function.
 int largest ()
     */
    public int largest() {
        int max = 0;
        int size = (last - first + N) % N;
        for (int i = 0; i < size; i++) {
            Element temp = dequeue();
            if (temp.getData() > max) {
                max = temp.getData();
            }
            enqueue(temp);
        }
        return max;
    }
}

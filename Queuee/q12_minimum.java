package Queuee;

import org.w3c.dom.Node;

public class q12_minimum {

    /*
Write a method where the method returns the minimum number in a
 queue. Write the function for both array and linked list implementa
tions. Do not use any class or external methods except isEmpty().
 int minimum()
     */
    public int minimum() {
        if (!isEmpty()) {

            int min = array[first];
            for (int i = (first + 1) % N; i != last; i = (i + 1) % N) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            return min;

        }
    }

    public int minimum() {
        if (!isEmpty()) {

            int min = first;
            Node current = first.next;
            while (current != null) {
                if (current < min) {
                    min = current;
                }
                current = current.next;
            }
            return min;
        }
    }
}

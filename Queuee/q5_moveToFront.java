package Queuee;

import org.w3c.dom.Node;

public class q5_moveToFront {

    public void moveToFront() {
        if (!isEmpty() && first != last) {

            Node current = first;
            while (current.next != last) {
                current = current.next;
            }

            Node temp = last;
            last = current;
            current.next = null;
            temp.next = first;
            first = temp;
        }
    }

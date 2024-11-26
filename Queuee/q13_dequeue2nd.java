package Queuee;

import org.w3c.dom.Node;

public class q13_dequeue2nd {

    public Element dequeue2nd() {
        // not empty and contains a 2nd element
        while (!isEmpty() && (first + 1) % N == last) {

            int secondIndex = (first + 1) % N;
            Element secondElement = array[secondIndex];

            // Shift elements to fill the gap left by the second element
            for (int i = secondIndex; i != last; i = (i + 1) % N) {
                array[i] = array[(i + 1) % N];
            }

            // Update the last index
            last = (last - 1 + N) % N;
        }
        return secondElement;
    }

    public Node dequeue2nd() {
        while (!isEmpty() && first.next != null) {

            Node secondNode = first.next;
            first.next = secondNode.next;

            // Update the last node if the second node was the last node
            if (secondNode == last) {
                last = first;
            }

            return secondNode;
        }

    }
}

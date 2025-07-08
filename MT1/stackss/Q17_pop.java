package stackss;

import stackss.Q15_isEmpty.DoubleNode;

/*
Write a method which pops the k’th element from the top and returns
 it. pop(1) is equal to the original pop, that is, the first element at the
 top has index 1. You are not allowed to use any stack methods and
 any external stacks, just attributes, constructors, getters and setters.
 Write the code for both array and linked list implementations.
 Element pop(int k)
 */
public class Q17_pop {

    Element pop(int k) {
        int idx = size - k; // Index of the k’th element from top
        Element result = array[idx];
        // Shift elements above idx down
        for (int i = idx; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return result;
    }

    Element pop(int k) {
        DoubleNode curr = head;
        DoubleNode prev = null;
        int count = 1;
        while (curr != null && count < k) {
            prev = curr;
            curr = curr.next;
            count++;
        }
        Element result = curr.data;
        if (prev == null) {
            // Remove head
            head = curr.next;
            if (head != null) {
                head.prev = null;
            }
        } else {
            prev.next = curr.next;
            if (curr.next != null) {
                curr.next.prev = prev;
            }
        }
        return result;
    }
}

package LinkedLists;

import com.sun.net.httpserver.Headers;

public class Q37_evenOddSorted {

    /*
Write the method
 boolean evenOddSorted()
 which returns true if the singly linked list odd indexed elements are
 sorted increasing order and even indexed elements are sorted in de
creasing order. The first node has index 1. You are not allowed to
 use any singly linked list methods. You are allowed to use attributes,
 constructors, getters and setters. Write the method in the LinkedList
 class.
 Sorted:
 2 10 3 7 6 4 9 2 13 0 20
     */

    public boolean evenOddSorted() {
        Node current = this.head;
        int index = 1;
        int lastOdd = null;
        int lastEven = null;

        while (current != null) {
            if (index % 2 == 1) { // Odd index: should be increasing
                if (lastOdd != null && current.data < lastOdd)
                    return false;
                lastOdd = current.data;
            } else { // Even index: should be decreasing
                if (lastEven != null && current.data > lastEven)
                    return false;
                lastEven = current.data;
            }
            current = current.next;
            index++;
        }
        return true;
}
}

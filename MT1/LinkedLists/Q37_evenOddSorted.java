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
    boolean evenOddSorted() {
        Node previous = head;
        Node tmp = head;
        while (tmp != null) {
            previous = tmp;
            tmp = tmp.getNext();
            if (tmp != null) {
                tmp = tmp.getNext();
                if (tmp != null) {
                    if (previous.getData() >= tmp.getData()) {
                        return false;
                    }
                }
            }
        }
        tmp = head.getNext();
        while (tmp != null) {
            previous = tmp;
            tmp = tmp.getNext();
            if (tmp != null) {
                tmp = tmp.getNext();
                if (tmp != null) {
                    if (previous.getData() <= tmp.getData()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

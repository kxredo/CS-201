package LinkedLists;

import java.util.LinkedList;

import org.w3c.dom.Node;

public class Q3_oddIndexedElements {

    /*
Write a function that will delete the odd indexed elements from a singly
 linked list. The function will also return the deleted nodes as a new
 linked list.
 LinkedList oddIndexedElements()
     */
    public LinkedList oddIndexedElements() {
        LinkedList oddList = new LinkedList();
        if (head == null) {
            return oddList;
        }

        Node current = head;
        Node prev = null;
        int index = 0;

        while (current != null) {
            if (index % 2 != 0) {
                Node next = current.getNext();
                if (prev != null) {
                    prev.setNext(next);
                }
                if (current == tail) {
                    tail = prev;
                }
                current.setNext(null);
                oddList.insertFirst(current);
                current = next;
            } else {
                prev = current;
                current = current.getNext();
            }
            index++;
        }
        return oddList;
    }

}

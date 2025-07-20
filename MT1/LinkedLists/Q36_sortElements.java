package LinkedLists;

import com.sun.net.httpserver.Headers;

public class Q36_sortElements {
/*
Write the following algorithm to sort the elements in the doubly linked
 list and return a new doubly linked list. The algorithm is as follows:
 
 Find the largest number N in the linked list.
 
 For each number i between 1 and N:
 – Count the number of times linked list has i.
 – Insert that many times i to the new linked list.

 The elements before sorting:
 5 2 3 4 2 3 4 3 2
 The elements after sorting:
 2 2 2 3 3 3 4 4 5
 DoublyLinkedList sortElements()
 You are not allowed to use any linked list methods. You are allowed to
 use attributes, constructors, getters and setters. Write the method in
 the DoublyLinkedList class
 */

    public DoublyLinkedList sortElements() {
        DoublyLinkedList sorted = new DoublyLinkedList();
        int largest = head.getData();
        Node tmp = head;

        while(tmp!=null) {
            if(tmp.getData() > largest) {
                largest = tmp.data;
            }
            tmp = tmp.next;
        }
        for(int i = 1; i <= largest; i++) {
            tmp = head;
            int count = 0;
            while(tmp!=null) {
                if(tmp.getData() == i) {
                    count++;
                }
                tmp = tmp.getNext();
            }
            for(int j = 0; j < count; j++) {
                DoublyNode newNode = new DoublyNode(j);
                if(sorted.head == null) {
                    sorted.head = newNode;
                } else {
                    sorted.tail.setNext(newNode);
                }
                newNode.setPrevious(sorted.tail);
                sorted.tail = newNode;
            }
        }
    }
    
}

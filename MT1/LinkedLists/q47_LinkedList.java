package LinkedLists;

import java.util.LinkedList;
/*
 Write another constructor method
 LinkedList(LinkedList∗ list , int k, int m)
 which constructs the original list from k lists of size m as follows. The
 first, second, ..., k’th element of the original linked list will be the first
 element of the first, second, . . ., k’th input linked list, the k + 1’st,
 k+2’nd, ..., 2k’th element of the original linked list will be the second
 element of the first, second, . . ., k’th input linked list. The elements
 of the original linked list should be created (not copied from the linked
 lists). Your algorithm should run in O(km) time. Allocate and use an
 external array of size k to store current pointers in each of k lists.
 */
public class q47_LinkedList {
    
    public LinkedList(LinkedList[] lists, int k, int m) {
        this.head = null;
        Node tail = null;
        Node[] currents = new Node[k];
        for (int i = 0; i < k; i++) {
            currents[i] = lists[i].head;
        }
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < k; i++) {
                if (currents[i] != null) {
                    Node newNode = new Node(currents[i].data);
                    if (this.head == null) {
                        this.head = newNode;
                        tail = newNode;
                    } else {
                        tail.next = newNode;
                        tail = newNode;
                    }
                    currents[i] = currents[i].next;
                }
            }
        }
    }
}

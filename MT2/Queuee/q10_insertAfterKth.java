package Queuee;

import org.w3c.dom.Node;

import stackss.Element;
/*
Write a function that adds a new element after the K’th (K ≥ 0)
 element of the queue. Write the function for both array and linked
 list implementations. You can safely assume that, there are at least K
 elements in the queue.
  void insertAfterKth ()
 */

public class q10_insertAfterKth {

    public void insertAfterKth() {
        // Calculate the index where the new element will be inserted
        int insertIndex = (first + k + 1) % N;

        // Shift elements to the right to make space for the new element
        for (int i = last; i != insertIndex; i = (i - 1 + N) % N) {
            array[(i + 1) % N] = array[i];
        }

        // Insert the new element at the calculated index
        array[insertIndex] = newElement;

        // Update the last index
        last = (last + 1) % N;
    }

    public void insertAfterKth(Node newNode, int k) {
        Node current = first;

        // Traverse to the K'th node
        for (int i = 0; i < k; i++) {
            current = current.next;
        }

        // Insert the new node after the K'th node
        newNode.next = current.next;
        current.next = newNode;

        // Update the last node if the new node is inserted at the end
        if (current == last) {
            last = newNode;
        }
    }
}

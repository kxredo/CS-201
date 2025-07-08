package stackss;

import stackss.Q15_isEmpty.DoubleNode;

/*
Write a function that inserts a new integer after the largest element of
 the stack. Write the function for array implementation. You are not
 allowed to use any stack methods, just attributes, constructors, getters
 and setters.
 void insertAfterLargest (int s)
 Contents of the stack before inserting 6:
 1 8 7 3
 Contents of the stack after inserting 6:
 1 8 6 7 3
 */
public class q24_insertAfterLargest {

    void insertAfterLargest(int s) {

        int maxIdx = 0;
        for (int i = 1; i < size; i++) {
            if (dataArray[i] > dataArray[maxIdx]) {
                maxIdx = i;
            }
        }

        // Shift elements to make space after maxIdx
        for (int i = size; i > maxIdx + 1; i--) {
            dataArray[i] = dataArray[i - 1];
        }

        // Insert new element after the largest
        dataArray[maxIdx + 1] = s;
        size++;
    }

    void insertAfterLargest(int s) {
        
        // Find node with largest value
        DoubleNode curr = head;
        DoubleNode largest = head;
        while (curr != null) {
            if (curr.data > largest.data) {
                largest = curr;
            }
            curr = curr.next;
        }
        DoubleNode newNode = new DoubleNode(s);
        newNode.next = largest.next;
        newNode.prev = largest;
        if (largest.next != null) {
            largest.next.prev = newNode;
        }
        largest.next = newNode;
    }
}

package stackss;

import com.sun.java.accessibility.util.TopLevelWindowListener;

public class Q23_addToStack {

    /*
 Write the method
 void addToStack(Stack s, int p, int q)
 which adds all elements indexed from p to q of the stack s to the top of
 the original stack. Your stack should contain new nodes, not the nodes
 in the stack s. The element at the top of the stack has index 1. You
 are not allowed to use any stack methods and any external stacks. You
 are allowed to use attributes, constructors, getters and setters. Write
 the method for linked list implementation.
 Contents of the original stack
 1 4 5 2
 Contents of the stack s
 3 1 7 5 11 14 6 8 16
 After addToStack(s, 3, 6)
 1 4 5 2 6 14 11 5
     */

    void addToStack(Stack s, int p, int q) {
        if (p < 1 || q < p || s.isEmpty()) {
            return;
        }

        LinkedListStack tempStack = new LinkedListStack();
        Node current = s.getTop(); // Assuming there's a method to get the top node

        // Traverse to find the starting point
        for (int i = 1; current != null && i < p; i++) {
            current = current.next; // Move to the p-th node
        }

        // Push the elements from index p to q into a temporary stack
        for (int i = p; current != null && i <= q; i++) {
            Node newNode = new Node(current.data);
            newNode.next = tempStack.getTop(); // Add to the top of tempStack
            tempStack.setTop(newNode); // Update top of tempStack
            current = current.next; // Move to the next node
        }

        // Add the temporary stack elements to the original stack
        while (!tempStack.isEmpty()) {
            Node newNode = new Node(tempStack.pop().data); // Assuming pop returns the top node
            newNode.next = top; // Add to the top of the original stack
            top = newNode; // Update top of original stack
        }
    }
    
}

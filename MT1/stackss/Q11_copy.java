package stackss;

/*
Write a function which returns a copy of the stack as a new stack. You
 are not allowed to use pop, push functions. Write the function for both
 link list and array implementations.
 Stack copy()
 */
public class Q11_copy {

    Stack copy() {
        // First, traverse and create a reversed copy
        Stack newStack = new Stack();
        Node current = head;
        Node revHead = null;
        
        while (current != null) {
            Node n = new Node(current.data);
            n.next = revHead;
            revHead = n;
            current = current.next;
        }
        // Now, reverse again to preserve stack order
        Node newHead = null;
        current = revHead;
        while (current != null) {
            Node n = new Node(current.data);
            n.next = newHead;
            newHead = n;
            current = current.next;
        }
        newStack.head = newHead;
        return newStack;
    }

    Stack copy() {
        Stack s = new Stack();
        s.data = new int[size];
        s.size = size;
        for (int i = 0; i < size; i++) {
            s.data[i] = data[i];
        }
        return s;
    }

}

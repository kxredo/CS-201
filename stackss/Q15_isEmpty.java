package stackss;

public class Q15_isEmpty {

    // Check if stack is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Push operation - adds at the head (top) of stack
    public void push(DoubleNode<T> newNode) {
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    // Pop the top node from the stack

    public DoubleNode<T> pop() {
        while (!isEmpty()) {

            DoubleNode<T> temp = head;
            head = head.next;

            if (head != null) {
                head.prev = null;
            }

            temp.next = null;  // Clear the reference to the next node
            return temp;
        }
    }
}

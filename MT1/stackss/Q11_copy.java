package stackss;

/*
Write a function which returns a copy of the stack as a new stack. You
 are not allowed to use pop, push functions. Write the function for both
 link list and array implementations.
 Stack copy()
 */
public class Q11_copy {

    public Stack copyLinkedList() {
        Stack newStack = new Stack();

        if (top == null) {
            return newStack;
        }

        // Create the first node
        newStack.top = new Node(top.data);
        newStack.size = size;

        // Create pointers for traversal
        Node currentOriginal = top.next;
        Node currentNew = newStack.top;

        // Copy each node
        while (currentOriginal != null) {
            currentNew.next = new Node(currentOriginal.data);
            currentNew = currentNew.next;
            currentOriginal = currentOriginal.next;
        }

        return newStack;
    }

    public Stack copyArray() {
        ArrayStack newStack = new ArrayStack(this.capacity);

        // Copy the array elements directly
        newStack.array = new int[this.capacity];
        System.arraycopy(this.array, 0, newStack.array, 0, this.capacity);

        // Copy the top pointer
        newStack.top = this.top;

        return newStack;
    }

}

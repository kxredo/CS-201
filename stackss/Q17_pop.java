package stackss;

public class Q17_pop {

    public Element popArray(int k) {
        if (k < 1 || k > top + 1) {
            throw new IllegalArgumentException("Invalid index: " + k);
        }

        // Calculate the index of the k'th element from the top
        int index = top - (k - 1);
        int element = array[index]; // Get the element at index

        // Shift elements down to remove the k'th element
        for (int i = index; i < top; i++) {
            array[i] = array[i + 1];
        }
        array[top] = null; // Clear the old top element
        top--; // Decrement the top index

        return new Element(element); // Return the popped element wrapped in Element
    }

    public Element popLinkedList(int k) {
        if (k < 1) {
            throw new IllegalArgumentException("Invalid index: " + k);
        }

        // Traverse to find the (k-1)'th node
        Node<T> current = top;
        Node<T> previous = null;

        for (int i = 1; i < k && current != null; i++) {
            previous = current;
            current = current.next; // Move to the next node
        }

        // If current is null, k is out of bounds
        if (current == null) {
            throw new IllegalArgumentException("Invalid index: " + k);
        }

        // If popping the top element
        if (previous == null) {
            top = top.next; // Move top to the next node
        } else {
            previous.next = current.next; // Bypass the k'th node
        }

        return new Element(current.data); // Return the popped element wrapped in Element
    }
}

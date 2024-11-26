package stackss;

public class Q19_push {
    public void pushArray(int k, int data) {
        if (k < 1 || k > top + 2) { // Check for valid k
            throw new IllegalArgumentException("Invalid index: " + k);
        }

        // Shift elements down to create space for the new element
        for (int i = top; i >= top - (k - 1); i--) {
            elements[i + 1] = elements[i];
        }

        elements[top - (k - 1)] = data; // Insert the new element
        top++; // Increment the top index
    }

    public void pushLinkedList(int k, int data) {
        if (k < 1) { // Check for valid k
            throw new IllegalArgumentException("Invalid index: " + k);
        }

        Node newNode = new Node(data); // Create new node

        if (k == 1) { // If k is 1, simply push to the top
            newNode.next = top;
            top = newNode;
            return;
        }

        // Traverse to find the position to insert
        Node current = top;
        Node previous = null;
        int index = 1; // Start counting from the top

        // Traverse to the k'th position
        while (current != null && index < k) {
            previous = current;
            current = current.next;
            index++;
        }

        // If we're inserting at the end
        if (current == null) {
            previous.next = newNode; // Insert at the end
            return;
        }

        // Insert the new node at the k'th position
        previous.next = newNode; // Link previous to the new node
        newNode.next = current; // Link new node to the current node
    }
}

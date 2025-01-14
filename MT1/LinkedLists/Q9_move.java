package LinkedLists;

public class Q9_move {

    /*
Given node X, write a function to move that node n position forward.
Assume that there are at least n nodes after node X.
void move(Node X, int n)
     */
    void move(Node X, int n) {
        if (X == null || n <= 0) {
            return; // Check if X is null or n is invalid
        }
        Node current = X;

        // Traverse n positions forward from node X
        for (int i = 0; i < n && current != null; i++) {
            current = current.next; // Move to the next node
        }

        // If current is null, there are not enough nodes to move forward
        if (current == null) {
            return;
        }

        // Update links to move node X
        Node nextNode = X.next; // Save the next node of X
        Node prevNode = X.prev; // Save the previous node of X

        // Bypass X in its current position
        if (prevNode != null) {
            prevNode.next = nextNode; // Update previous node's next
        }
        if (nextNode != null) {
            nextNode.prev = prevNode; // Update next node's prev
        }

        // Now insert X after the current node
        X.next = current; // Set X's next to current
        X.prev = current.prev; // Set X's previous to current's previous

        if (current.prev != null) {
            current.prev.next = X; // Link the previous of current to X
        }
        current.prev = X; // Set current's previous to X
    }

}

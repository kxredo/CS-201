package LinkedLists;

public class Q27_addAfterEachNode {

    /*
Write the method which add newnode after each node in the singly linked list. 
void addAfterEachNode(Node<T> newNode)
     */
    void addAfterEachNode(Node<T> newNode) {
        Node<T> current = head;

        // Traverse the linked list
        while (current != null) {
            Node<T> duplicate = new Node<>(newNode.data); // Create a duplicate node

            // Insert the duplicate node after the current node
            duplicate.next = current.next; // Point duplicate's next to current's next
            current.next = duplicate; // Link current node to the duplicate

            current = duplicate.next; // Move to the next original node
        }
    }

}

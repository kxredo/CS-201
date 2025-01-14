package LinkedLists;

public class Q20_doubleList {
/*
Write a function which doubles each node in a doubly linked list, that is, after each node inserts that node again.
void doubleList()
 */
void doubleList() {
    DoubleNode current = head;

    // Traverse the list
    while (current != null) {
        DoubleNode duplicate = new DoubleNode(current.data); // Create a duplicate node
        duplicate.next = current.next; // Point duplicate's next to current's next
        duplicate.prev = current; // Point duplicate's previous to current

        if (current.next != null) {
            current.next.prev = duplicate; // Update next node's previous pointer to the duplicate
        }

        current.next = duplicate; // Insert duplicate after the current node
        current = duplicate.next; // Move to the node after the duplicate
    }
}

}

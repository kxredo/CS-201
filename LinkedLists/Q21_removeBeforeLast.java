package LinkedLists;

public class Q21_removeBeforeLast {
/*
Write a function which removes the node before the last node of a single link list.
void removeBeforeLast(
 */
void removeBeforeLast() {
    if (head == null || head.next == null || head.next.next == null) {
        // If there are fewer than three nodes, there's no "node before the last" to remove
        return;
    }

    Node current = head;

    // Traverse to the node before the second-last node
    while (current.next.next.next != null) {
        current = current.next;
    }

    // Remove the node before the last node by skipping it
    current.next = current.next.next;
}

}

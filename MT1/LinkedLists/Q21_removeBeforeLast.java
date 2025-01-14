package LinkedLists;

public class Q21_removeBeforeLast {
/*
Write a function which removes the node before the last node of a single link list.
void removeBeforeLast(
 */
void removeBeforeLast() {
    
    Node current = head;

    // Traverse to the node before the second-last node
    while (current.next.next.next != null) {
        current = current.next;
    }

    // Remove the node before the last node by skipping it
    current.next = current.next.next;
}

}

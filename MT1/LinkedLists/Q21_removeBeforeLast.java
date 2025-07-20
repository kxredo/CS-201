package LinkedLists;

public class Q21_removeBeforeLast {
/*
Write a function which removes the node before the last node of a single link list.
void removeBeforeLast(
 */
void removeBeforeLast() {
    Node current = head;

    while (current.next.next.next != null) {
        current = current.next;
    }
    current.next = current.next.next;
}

}

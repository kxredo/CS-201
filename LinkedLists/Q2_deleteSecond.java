package LinkedLists;

public class Q2_deleteSecond {
/*
Write a function to delete the second node from a singly linked list.
void deleteSecond()
 */
public void deleteSecond() {
    if (head == null || head.next == null) {
        // If the list is empty or has only one node, there's no second node to delete
        return;
    }

    Node second = head.next;
    head.next = second.next;
    second.next = null; // Optional: clear the reference to help garbage collection
}
}
}

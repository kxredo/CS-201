package LinkedLists;

public class Q2_deleteSecond {
/*
Write a function to delete the second node from a singly linked list.
void deleteSecond()
 */
public void deleteSecond() {

    Node second = head.next;
    head.next = second.next;
    second.next = null; // Optional: clear the reference to help garbage collection
}
}
}

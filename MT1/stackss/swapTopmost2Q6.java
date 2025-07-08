package.stackss;

import java.util.Stack;

public class swapTopmost2Q6 {

    /*
Write a function that swaps the two topmost elements of a stack. Write
the function for both link list and array implementations.
void swapTopmost2()
     */

void swapTopmost2() {
    int temp = data[size - 1];
    data[size - 1] = data[size - 2];
    data[size - 2] = temp;
}


// Linked List implementation
public void swapTopmost2LL() {
    while(top != null || top.next != null) {
    Node first = head;
    Node second = head.next;

    first.next = second.next;
    second.next = first;
    head = second;
}
}
}
package.stackss;

import java.util.Stack;

public class swapTopmost2Q6 {

    /*
Write a function that swaps the two topmost elements of a stack. Write
the function for both link list and array implementations.
void swapTopmost2()
     */

// Arrays Implementation
public void swapTopmost2Arr() {
    if (top < 1) {
        throw new RuntimeException("Not enough elements to swap");
    }
    // Swap the top two elements
    int temp = stack[top];
    stack[top] = stack[top - 1];
    stack[top - 1] = temp;
}


// Linked List implementation
public void swapTopmost2LL() {
    while(top != null || top.next != null) {
    // Swap the data of the top two nodes
    int temp = top.data;
    top.data = top.next.data;
    top.next.data = temp;
}
}
}
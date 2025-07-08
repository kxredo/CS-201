package stackss;

import java.util.Stack;

import org.w3c.dom.Node;

/*
Write a function which pops the last two items of a stack and returns
 the product of those two popped numbers. You are not allowed to use
 pop, push functions. Write the function for both link list and array
 implementations.
 int multiply()
 */
public class Q9_multiply {

    int multiply() {
        int product = data[size - 1] * data[size - 2];
        size = size - 2; // Remove last two elements
        return product;
    }

    int multiply() {
        int product = head.data * head.next.data;
        // Remove top two nodes
        head = head.next.next;
        return product;
    }
}

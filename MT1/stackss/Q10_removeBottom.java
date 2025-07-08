package stackss;

import java.util.Stack;

/*
Write a function which removes only the bottom element of the stack.
 You are only allowed to use pop, push, isEmpty functions (Hint: Use
 external stack).
 void removeBottom()
 */

public class Q10_removeBottom {

    void removeBottom() {
        Stack temp = new Stack();
        // Move all elements except the bottom to temp
        while (!isEmpty()) {
            Element e = pop();
            if (isEmpty()) {
                // e is the bottom element, do not push it to temp
                break;
            }
            temp.push(e);
        }
        // Restore stack
        while (!temp.isEmpty()) {
            push(temp.pop());
        }
    }

}

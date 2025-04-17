package stackss;

import javax.xml.transform.Templates;

public class Q12_doubleStack {
/*
Write a function which double each item in the stack, that is, each item
 appears two times one after another in the stack. You are only allowed
 to use pop, push, isEmpty functions (Hint: Use external stack).
 void doubleStack()
 */
    void doubleStack() {
        int[] tempStack = new int[capacity];
        int tempTop = -1;

        // Copy elements to temp stack
        for (int i = 0; i <= top; i++) {
            tempStack[++tempTop] = stack[i];
        }

        // Double elements in the original stack
        for (int i = 0; i <= tempTop; i++) {
            stack[i * 2] = tempStack[i];
            stack[i * 2 + 1] = tempStack[i];
        }

        // Update top pointer
        top = tempTop * 2 + 1;
    }
}
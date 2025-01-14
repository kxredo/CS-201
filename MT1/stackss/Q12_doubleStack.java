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
        Stack<Integer> tempStack = new Stack<>();

        // Step 1: Pop each element and push it twice to the temporary stack
        while (!isEmpty()) {
            int top = pop();
            tempStack.push(top);
            tempStack.push(top); // Push the element twice
        }

        // Step 2: Push all elements back to the original stack
        while (!tempStack.isEmpty()) {
            push(tempStack.pop());
        }
    }

    

}
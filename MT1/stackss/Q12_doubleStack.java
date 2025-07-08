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
        Stack temp = new Stack();
        // Step 1: Reverse stack into temp
        while (!isEmpty()) {
            temp.push(pop()); // Push each popped item onto temp
        }
        // Step 2: For each item in temp, push it twice to the original stack
        while (!temp.isEmpty()) {
            
            push(temp.pop()); // Pop from temp and push twice to the original stack
            push(temp.pop());
        }
    }
}

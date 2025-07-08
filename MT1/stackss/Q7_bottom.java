package stackss;

import com.sun.java.accessibility.util.TopLevelWindowListener;
import java.util.Stack;

/*
Write a function that returns the bottom element of a stack. You are
 only allowed to use pop, push, isEmpty functions.
 Element bottom()
 */
public class Q7_bottom {

    public Element bottom() {
        Stack temp = new Stack<>();
        // Pop all elements except the bottom, push to temp stack
        while (!isEmpty()) {
            Element e = pop();
            if (isEmpty()) {
                // e is the bottom element
                // Restore stack
                while (!temp.isEmpty()) {
                    push(temp.pop());
                }
                return e;
            } else {
                temp.push(e);
            }
        }
        return null; // Stack is empty

    }

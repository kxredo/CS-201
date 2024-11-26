package stackss;

import java.util.Stack;


public class Q10_removeBottom {


    public void removeBottom() {
        // If stack is empty or has only one element
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        if (top.next == null) {
            // Only one element, simply remove it
            top = null;
            return;
        }
        
        // Temporary stack to store elements
        Stack tempStack = new Stack();
        
        // Pop all elements except the last one and store them in temp stack
        while (top.next != null) {
            tempStack.push(pop());
        }
        
        // At this point, top points to the bottom element
        // Remove it by setting top to null
        top = null;
        
        // Restore all elements from temp stack to original stack
        while (!tempStack.isEmpty()) {
            push(tempStack.pop());
        }
    }

}
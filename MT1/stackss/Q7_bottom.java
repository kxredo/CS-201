package stackss;

import com.sun.java.accessibility.util.TopLevelWindowListener;
import java.util.Stack;

public class Q7_bottom {
    
    public Element bottom() {
        // Pop the top element
        Element topElement = pop();
    
        // If the stack becomes empty, the popped element is the bottom element
        if (isEmpty()) {
            return topElement;
        } else {
            // Recursively find the bottom element
            Element bottomElement = bottom();
    
            // Push the top element back to preserve stack order
            push(topElement);
    
            return bottomElement;
        }
    }
    
}

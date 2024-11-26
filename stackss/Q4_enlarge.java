package stackss;
import java.util.Stack;
public class Q4_enlarge {
    
    /*
For array representation, write a function that enlarges the stack when
 it is full. The new stack will hold two times more than the original
 stack.
 void enlarge()
     */
    private void enlarge() {
        // Double the capacity
        int newCapacity = capacity * 2;
        // Create a new array with the larger capacity
        int[] newStack = new int[newCapacity];
        // Copy elements from the old stack to the new one
        for (int i = 0; i <= top; i++) {
            newStack[i] = stack[i];
        }
        // Replace the old stack with the new one
        stack = newStack;
        // Update the capacity
        capacity = newCapacity;
    
}
    
}
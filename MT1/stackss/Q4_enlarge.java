package stackss;
import java.util.Stack;
public class Q4_enlarge {
    
    /*
For array representation, write a function that enlarges the stack when
 it is full. The new stack will hold two times more than the original
 stack.
 void enlarge()
     */
    public void enlarge() {
        int newCapacity = capacity * 2;
        int[] newStack = new int[newCapacity];
        for (int i = 0; i < capacity; i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
        capacity = newCapacity;
    }
    
}
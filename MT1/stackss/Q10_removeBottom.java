package stackss;

import java.util.Stack;


public class Q10_removeBottom {


    public void removeBottom() {
        int[] tempStack = new int[capacity];
        int tempTop = -1;

        // Pop elements and store them in a temporary stack
        for (int i = 0; i < top - K + 1; i++) {
            tempStack[++tempTop] = stack[i];
        }

        // Restore the remaining elements back to the original stack
        for (int i = 0; i <= tempTop; i++) {
            stack[i] = tempStack[i];
        }

        // Update the top pointer
        top = tempTop;
    }

}
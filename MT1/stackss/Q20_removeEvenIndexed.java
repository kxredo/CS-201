package stackss;

public class Q20_removeEvenIndexed {
    /*
Write a method which removes only the even indexed (2, 4, . . .)
 elements from the stack. The first element at the bottom has index 1.
 You are only allowed to use pop, push, isEmpty functions (Hint: Use
 external stack). You are not allowed to use any stack attributes such
 as N, top, array etc.
 void removeEvenIndexed()
     */

    public void removeEvenIndexedLL() {
        Stack tempStack = new Stack();
        int index = 1; // Start index from 1

        // Transfer elements to the temp stack, skipping even-indexed elements
        while (!isEmpty()) {
            int current = pop();
            if (index % 2 != 0) { // Push only odd-indexed elements
                tempStack.push(current);
            }
            index++;
        }
        // Restore elements back to the original stack
        while (!tempStack.isEmpty()) {
            push(tempStack.pop());
        }
    }

}

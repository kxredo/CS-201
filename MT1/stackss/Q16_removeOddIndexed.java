package stackss;

public class Q16_removeOddIndexed {

    /*
Write a method which removes only the odd indexed (1, 3, ...) elements
 from the stack. The first element at the bottom has index 1. You are
 only allowed to use pop, push, isEmpty functions (Hint: Use external
 stack). You are not allowed to use any stack attributes such as N, top,
 array etc. You can solve the question with any stack implementation.
 void removeOddIndexed()
     */

    public void removeOddIndexed() {
        Stack temp = new Stack();
        int index = 0;

        // Pop all elements from the original stack and push them onto the temp stack
        while (!isEmpty()) {
            temp.push(pop());
        }

        // Push elements back to the original stack, skipping odd indices
        while (!temp.isEmpty()) {
            if (index % 2 == 0) {
                push(temp.pop());
            }
            index++;
        }
    }

}

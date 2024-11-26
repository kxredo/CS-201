package stackss;

public class Q16_removeOddIndexed {

    void removeOddIndexed() {
        Stack tempStack = new Stack<>();
        int index = 1;

        // Transfer elements to the temp stack, skipping odd-indexed elements
        while (!isEmpty()) {
            int top = pop();
            if (index % 2 == 0) {  // Push only even-indexed elements
                tempStack.push(top);
            }
            index++;
        }

        // Transfer elements back to the original stack to preserve the order
        while (!tempStack.isEmpty()) {
            push(tempStack.pop());
        }
    }

}

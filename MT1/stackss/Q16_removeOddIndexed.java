package stackss;

public class Q16_removeOddIndexed {

    public void removeOddIndexed() {
        Stack<Integer> tempStack = new Stack<>();
        int index = 0;

        // Pop all elements from the original stack and push them onto the temp stack
        while (!isEmpty()) {
            tempStack.push(pop());
        }

        // Push elements back to the original stack, skipping odd indices
        while (!tempStack.isEmpty()) {
            int value = tempStack.pop();
            if (index % 2 == 0) {
                push(value);
            }
            index++;
        }
    }

}

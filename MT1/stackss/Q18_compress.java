package stackss;

public class Q18_compress {

    public void compress() {
        Stack<Integer> tempStack = new Stack<>();
        Integer previous = null;

        // Pop elements from the original stack into the temp stack, removing duplicates
        while (!isEmpty()) {
            int current = pop();
            if (previous == null || current != previous) {
                tempStack.push(current);
                previous = current;
            }
        }

        // Push elements back to the original stack in correct order
        while (!tempStack.isEmpty()) {
            push(tempStack.pop());
        }
    }

}

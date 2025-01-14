package stackss;

public class Q13_removeMiddle {
/*
Write a function which removes only the middle element of the stack.
 You are only allowed to use pop, push, isEmpty functions (Hint: Use
 external stack).
 void removeMiddle()
 */
    void removeMiddle() {
        Stack<Integer> tempStack = new Stack<>();
        int size = 0;

        // Step 1: Count the elements to find the middle index
        while (!isEmpty()) {
            tempStack.push(pop());
            size++;
        }

        // Step 2: Calculate the middle index
        int middleIndex = size / 2;

        // Step 3: Push elements back to the original stack, skipping the middle element
        int currentIndex = 0;
        while (!tempStack.isEmpty()) {
            int top = tempStack.pop();
            if (currentIndex != middleIndex) {  // Skip the middle element
                push(top);
            }
            currentIndex++;
        }
    }

}

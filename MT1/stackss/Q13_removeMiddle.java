package stackss;

public class Q13_removeMiddle {

    /*
Write a function which removes only the middle element of the stack.
 You are only allowed to use pop, push, isEmpty functions (Hint: Use
 external stack).
 void removeMiddle()
     */
    void removeMiddle() {
        Stack temp = new Stack();
        int count = 0;

        while (!isEmpty()) {
            temp.push(pop());
            count++;
        }

        int mid = count / 2; // 0-based index, removes the "middle" for odd, lower middle for even

        // Step 2: Restore stack, skipping the middle element
        for (int i = 0; i < count; i++) {
            if (i == mid) {
                continue; // Skip the middle element

            }
            push(temp.pop());
        }
    }

}

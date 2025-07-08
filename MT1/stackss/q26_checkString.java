package stackss;

public class q26_checkString {

    boolean checkString(int[] s) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        int n = s.length;

        // Step 1: Push all 1s to stack
        while (i < n && s[i] == 1) {
            stack.push(1);
            i++;
        }
        if (stack.isEmpty()) {
            return false; // there must be at least one 1
        }
        // Step 2: Push all 2s to stack
        boolean has2 = false;
        while (i < n && s[i] == 2) {
            stack.push(2);
            i++;
            has2 = true;
        }
        if (!has2) {
            return false; // there must be at least one 2
        }
        // Step 3: For every 3, pop a 2 from stack
        boolean has3 = false;
        while (i < n && s[i] == 3) {
            if (stack.isEmpty() || stack.pop() != 2) {
                return false;
            }
            i++;
            has3 = true;
        }
        if (!has3) {
            return false; // there must be at least one 3
        }
        // Step 4: For every 4, pop a 1 from stack
        boolean has4 = false;
        while (i < n && s[i] == 4) {
            if (stack.isEmpty() || stack.pop() != 1) {
                return false;
            }
            i++;
            has4 = true;
        }
        if (!has4) {
            return false; // there must be at least one 4
        }
        // Step 5: Check stack is empty and end of array
        return stack.isEmpty() && i == n;
    }
}

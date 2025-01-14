package stackss;

import java.util.Stack;

public class Q2_isBalanced {
/*
Write a function using stacks that determines if a parenthesis sequence
 is balanced or not. For example the parenthesis sequence ( ( ) ( ) ) is
 balanced, whereas the parenthesis sequence ( ( ( ) ( is not. You can
 assume that the character sequence contains just ’(’ and ’)’ characters.
 */
    public static boolean isBalanced(String s) {
        // Create a stack to keep track of opening parentheses
        Stack<Character> stack = new Stack<>();

        // Traverse through each character in the string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If it's an opening parenthesis, push it to the stack
            if (c == '(') {
                stack.push(c);
            }
            // If it's a closing parenthesis, check if there is a matching opening parenthesis
            else if (c == ')') {
                // If stack is empty, it means there is no opening parenthesis to match
                if (stack.isEmpty()) {
                    return false;
                }
                // Pop the top of the stack (an opening parenthesis)
                stack.pop();
            }
        }

        // After processing all characters, if the stack is empty, it's balanced
        return stack.isEmpty();
    }
}
package stackss;
import java.util.Stack;

public class Q3_isBalanced {
/*
Write a function using stacks that determines if a parenthesis sequence
 is balanced or not. For example the parenthesis sequence ( { ( ) [ { }
 ] } ( ) ) is balanced, whereas the parenthesis sequence ( } ] ) ( is not.
 You can assume that the character sequence contains just (, {, [, ), },
 ] characters.
 boolean isBalanced(String s)
 */

    public static boolean isBalanced(String s) {
        // Create a stack to keep track of opening brackets
        Stack<Character> stack = new Stack<>();

        // Traverse through each character in the string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Push opening brackets to the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            // If it's a closing bracket, check if there is a matching opening bracket
            else if (c == ')' || c == '}' || c == ']') {
                // If stack is empty, it means there is no opening bracket to match
                if (stack.isEmpty()) {
                    return false;
                }
                // Pop the top of the stack and check if it matches the closing bracket
                char top = stack.pop();
                if (!isMatchingPair(top, c)) {
                    return false;
                }
            }
        }

        // After processing all characters, if the stack is empty, it's balanced
        return stack.isEmpty();
    }

    // Helper function to check if the two brackets form a valid pair
    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}

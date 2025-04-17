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
    Stack<Character> stack = new Stack<>();
    
    for (char c : s.toCharArray()) {
        if (c == '(' || c == '{' || c == '[') {
            stack.push(c);
        } else if (c == ')' || c == '}' || c == ']') {
            if (stack.isEmpty()) {
                return false;
            }
            char top = stack.pop();
            if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                return false;
            }
        }
    }
    
    return stack.isEmpty();
}

    // Helper function to check if the two brackets form a valid pair
    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}

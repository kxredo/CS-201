package stackss;

import java.util.Stack;

public class Q5_palindrome {

    public static boolean isPalindrome(String s) {
        Stack<Character> stack = new Stack<>();
          
        // Push characters onto the stack
        for (char c : s.toCharArray()) {
            stack.push(c);
        }

        // Compare characters from the original string with popped characters from the stack
        int i = 0;
        while (!stack.isEmpty()) {
            if (s.charAt(i) != stack.pop()) {
                return false;
            }
            i++;
        }

        return true;
    }
    
    
    }

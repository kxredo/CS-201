package stackss;

import java.util.Stack;

public class Q5_palindrome {

    public static boolean palindrom(String s) {
        Stack<Character> stack = new Stack<>();
        
        // Push all characters of the string onto the stack
        for (char c : s.toCharArray()) {
            stack.push(c);
        }
        
        // Pop characters from the stack and check against the original string
        for (char c : s.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        
        return true;
    }
    
    
    }

package stackss;

import java.util.Stack;

/*
Write a function that determines if a character sequence is palindrome,
 that is, it is equal its reverse. (Hint: Use a stack to reverse the character
 sequence)
 boolean palindrom(String s)
 */
public class Q5_palindrome {

    public static boolean palindrom(String s) {
        Stack<Character> stack = new Stack<>();

        // Push all characters of the string onto the stack
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }

        // Pop characters from the stack and check against the original string
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }

}

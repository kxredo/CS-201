package stackss;

public class Q22_isBalanced {

    /*
Write a static method using an external stack (only one external stack
 is allowed) that determines if an integer array is balanced or not. 
 A number k less than 10 is balanced with the number 10+k. 
 For example, the array 2, 3, 13, 12, 4, 14 is balanced, whereas 5, 15, 4, 3, 14, 13 not.
 You are not allowed to use any stack attributes such as N, top, array
 etc. Write the method in array implementation.
 boolean isBalanced(int[] a)
     */

    static boolean isBalanced(int[] a) {
        ArrayStack stack = new ArrayStack(a.length);

        for (int value : a) {
            if (value < 10) {
                stack.push(value);
            } else if (value >= 10 && !stack.isEmpty() && value == 10 + stack.pop()) {
                continue;
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }
    
    
    
}

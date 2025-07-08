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
    public static boolean isBalanced(int[] a) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < a.length; i++) {
            int num = a[i];
            if (num < 10) {
                stack.push(num);
            } else if (num >= 10 && num < 20) {
                if (stack.isEmpty()) {
                    return false;
                }
                int top = stack.pop();
                if (num != top + 10) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

}

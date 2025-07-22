package Trees;

public class q28_sumOfTree {
/*
Write a recursive method in TreeNode class that computes the sum
 of all keys that are less than X in a binary search tree. You are not
 allowed to use any tree methods, just attributes, constructors, getters
 and setters.
 int sumOfTree(int X)
 */
    int sumOfTree(int X) {
        int sum = 0;
        if (data < X) {
            sum += data;
        }
        if (left != null) {
            sum += left.sumOfTree(X);
        }
        if (right != null) {
            sum += right.sumOfTree(X);
        }
        return sum;
    }
    
}

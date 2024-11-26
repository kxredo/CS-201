package Trees;

public class q10_sumOfTree {
/*
Write a function that computes the sum of all keys in a binary search tree.
int sumOfTree()
 */
    int sumOfTree2() {
        if (left == null && right == null) {
            return val;
        }
        int total = val;
        if (left != null) {
            total += left.sumOfTree2();
        }
        if (right != null) {
            total += right.sumOfTree2();
        }
        return total;
    }
    
    int sumOfTree() {
        if (root != null) {
            return root.sumOfTree2();
        } else {
            return 0;
        }
    }
    
}

package Trees;

import org.w3c.dom.Node;

public class q20_containsTwoSameNumbers {

    /*
Write a recursive function that checks whether the binary search tree
 contains two same numbers or not.
 boolean containsTwoSameNumbers()
     */
    private boolean containsTwoSameNumbers(TreeNode left, TreeNode right) {
        if (left != null && right != null) {
            if (left.data == right.data) {
                return true;
            }
            return containsTwoSameNumbers(left.left, right.right) || containsTwoSameNumbers(left.right, right.left);
        }
        return false;
    }



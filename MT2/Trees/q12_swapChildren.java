package Trees;

import javax.swing.tree.TreeNode;

public class q12_swapChildren {
/*
Write a function that swaps left and right children of all nodes in a
 binary search tree.
 void swapChildren()
 */
    void swapChildren() {
        TreeNode temp = left;
        left = right;
        right = temp;

        if (left != null) {
            left.swapChildren();
        }
        if (right != null) {
            right.swapChildren();
        }
    }

}

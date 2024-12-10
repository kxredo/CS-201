package Trees;

import javax.swing.tree.TreeNode;

public class q12_swapChildren {
/*
Write a function that swaps left and right children of all nodes in a
 binary search tree.
 void swapChildren()
 */
    void swapChildren2() {
        TreeNode temp = left;
        left = right;
        right = temp;

        if (left != null) {
            left.swapChildren2();
        }
        if (right != null) {
            right.swapChildren2();
        }
    }

    void swapChildren() {
        if (root != null) {
            root.swapChildren2();
        }
    }

}

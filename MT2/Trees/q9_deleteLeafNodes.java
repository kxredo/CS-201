package Trees;

import javax.swing.tree.TreeNode;

public class q9_deleteLeafNodes {
/*
Write a function that deletes all leaf nodes from a binary search tree.
void deleteLeafNodes()
 */
    void deleteLeafNodes(){
        if (left != null) {
            if (left.left == null && left.right == null) {
                left = null;
            } else {
                left.deleteLeafNodes();
            }
        }
        if (right != null) {
            if (right.left == null && right.right == null) {
                right = null;
            } else {
                right.deleteLeafNodes();
            }
        }
    }
}

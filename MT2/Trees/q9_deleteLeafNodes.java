package Trees;

import javax.swing.tree.TreeNode;

public class q9_deleteLeafNodes {
/*
Write a function that deletes all leaf nodes from a binary search tree.
void deleteLeafNodes()
 */
    public void deleteLeafNodes() {
        if (left == null && right == null) {
            this = null;
        } else {
            left.deleteLeafNodes();
            right.deleteLeafNodes();
        }
    }
}

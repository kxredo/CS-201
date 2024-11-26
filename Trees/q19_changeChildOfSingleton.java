package Trees;

import javax.swing.tree.TreeNode;

public class q19_changeChildOfSingleton {

    public void changeChildOfSingleton() {
        
        // If the node has only a left child, move it to the right
        if (left != null && right == null) {
            right = left;
            left = null;
        } // If the node has only a right child, move it to the left
        else if (right != null && left == null) {
            left = right;
            right = null;
        }

        // Recursively process left and right subtrees
        changeChildOfSingleton(left);
        changeChildOfSingleton(right);
    }
}

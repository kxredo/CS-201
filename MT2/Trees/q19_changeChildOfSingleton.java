package Trees;

import javax.swing.tree.TreeNode;

public class q19_changeChildOfSingleton {

    /*
Write a recursive function that

 puts the left child to the right if it has only left child
 puts the right child to the left if it has only right child
 does nothing if it has two children
 for all nodes in a binary search tree.
 void changeChildOfSingleton()
     */
    void changeChildOfSingleton() {
        if (left != null && right == null) {
            right = left;
            left = null;
        } else if (right != null && left == null) {
            left = right;
            right = null;
        }
        if (left != null) {
            left.changeChildOfSingleton();
        }
        if (right != null) {
            right.changeChildOfSingleton();
        }
    }
}

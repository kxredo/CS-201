package Trees;

public class q13_height {

    /*
Write a function that determines the height of a tree.
 int height()
     */
    int height() {
        if (left == null && right == null) {
            return 0; // Leaf node has height 0
        }
        int leftHeight = (left != null) ? left.height() : -1;
        int rightHeight = (right != null) ? right.height() : -1;
        return 1 + Math.max(leftHeight, rightHeight);

    }

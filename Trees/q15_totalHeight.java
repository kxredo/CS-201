package Trees;

public class q15_totalHeight {
/*
 Write a function that computes the total height of a tree. The total
 height of a binary search tree is the sum of heights of all nodes in the
 tree.
 int totalHeight()
 */
    int totalHeight2() {
        int leftHeight = 0;
        if (left != null) {
            leftHeight = left.totalHeight2();
        }
        int rightHeight = 0;
        if (right != null) {
            rightHeight = right.totalHeight2();
        }
        return 1 + leftHeight + rightHeight;
    }

    int totalHeight() {
        if (root != null) {
            return root.totalHeight2();
        } else {
            return 0;
        }
    }

}

package Trees;

public class q24_leftist {

    int leftist() {
        int count = 0;

        // A node is leftist if it has only a left child or its left child has a greater value than the right child
        if ((left != null && right == null) || (left != null && right != null && left.val > right.val)) {
            count = 1;
        }

        // Recursively count leftist nodes in left and right subtrees
        if (left != null) {
            count += left.leftist();
        }
        if (right != null) {
            count += right.leftist();
        }

        return count;
    }


}

package Trees;

public class leafCount {

    /*
Write a function that determines the number of leaves in a binary search
 tree.
 int leafCount()
     */
    int leafCount2() {
        if (left == null && right == null) {
            return 1;
        }
        if (left != null) {
            total += left.leaftCount2();
        }
        if (right != null) {
            total += right.leafCount2();
        }
        return total;
    }

    int leafCount() {
        if (root != null) {
            return root.leafCount2();
        } else {
            return 0;
        }
    }
}

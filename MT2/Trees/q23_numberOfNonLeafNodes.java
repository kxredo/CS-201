package Trees;

public class q23_numberOfNonLeafNodes {

    int numberOfNonLeafNodes() {
        int count = 0;

        // If the node has at least one child, it's a non-leaf node
        if (left != null || right != null) {
            count = 1;
        }

        // Recursively count non-leaf nodes in the left and right subtrees
        if (left != null) {
            count += left.numberOfNonLeafNodes();
        }
        if (right != null) {
            count += right.numberOfNonLeafNodes();
        }

        return count;
    }
}

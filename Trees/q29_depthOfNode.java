package Trees;

public class q29_depthOfNode {

    int depthOfNode(int X) {
        int depth = 0;
        TreeNode current = this;  // Start from the root node

        // Traverse the tree iteratively
        while (current != null) {
            if (current.val == X) {
                return depth;  // Node found, return the depth
            } else if (X < current.val) {
                current = current.left;  // Go to the left subtree
            } else {
                current = current.right;  // Go to the right subtree
            }
            depth++;  // Increment depth as we move down the tree
        }

        // If the node with value X is not found, return -1
        return -1;
    }
}

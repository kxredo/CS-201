package Trees;

public class q29_depthOfNode {
/*
Write a non-recursive method in Tree class that returns the depth of
 the node containing a given data X in a binary search tree. You are not
 allowed to use any tree methods, just attributes, constructors, getters
 and setters.
 int depthOfNode(int X)
 */
    int depthOfNode(int X) {
        int depth = 0;
        TreeNode current = root;  // Start from the root node

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
    }

}

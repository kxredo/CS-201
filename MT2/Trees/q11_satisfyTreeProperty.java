package Trees;

public class q11_satisfyTreeProperty {

    public boolean satisfyTreeProperty(TreeNode root) {
        return satisfyTreeProperty(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    private boolean satisfyTreeProperty(TreeNode node, int min, int max) {
        if (node == null) {
            return true;
        }
        // Check if the current node's value is within the valid range
        if (node.val <= min || node.val >= max) {
            return false;
        }
        // Recursively check the left and right subtrees
        return satisfyTreeProperty(node.left, min, node.val) && satisfyTreeProperty(node.right, node.val, max);
    }
}

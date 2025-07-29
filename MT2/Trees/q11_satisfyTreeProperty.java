package Trees;

public class q11_satisfyTreeProperty {

    public boolean satisfyTreeProperty(TreeNode root) {
        return satisfyTreeProperty(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    boolean satisfyTreeProperty() {
        if (left == null && right == null) {
            return true; // Leaf node satisfies the property
        }

        int leftValue = (left != null) ? left.data : 0;
        int rightValue = (right != null) ? right.data : 0;

        if (data == leftValue + rightValue) {
            boolean leftSatisfies = (left == null || left.satisfyTreeProperty());
            boolean rightSatisfies = (right == null || right.satisfyTreeProperty());
            return leftSatisfies && rightSatisfies;
        }

        return false; // Current node does not satisfy the property
    }
}

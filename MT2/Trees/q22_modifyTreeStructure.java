package Trees;

public class q22_modifyTreeStructure {

    class TreeNode {

        int val;
        TreeNode left;           // First child
        TreeNode leftOfMiddle;   // Second child
        TreeNode rightOfMiddle;  // Third child
        TreeNode right;          // Fourth child

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.leftOfMiddle = null;
            this.rightOfMiddle = null;
            this.right = null;
        }

        TreeNode search(TreeNode root, int key) {
            if (root == null) {
                return null; // Key not found
            }

            if (root.val == key) {
                return root; // Key found
            }

            // Traverse the tree based on the value of the key
            if (key < root.val) {
                return search(root.left, key);
            } else if (key < root.val * 1.5) { // Adjust logic to match search tree property
                return search(root.leftOfMiddle, key);
            } else if (key < root.val * 2) {
                return search(root.rightOfMiddle, key);
            } else {
                return search(root.right, key);
            }
        }

    }

}

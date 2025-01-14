package Trees;

public class q27_numberOfDuplicates {

            // Recursive method to count duplicates in the binary search tree
            int numberOfDuplicates() {
            int count = 0;

            // Check for duplicates on the left subtree
            if (left != null && left.val == val) {
                count++;  // Duplicate found in left subtree
            }

            // Check for duplicates on the right subtree
            if (right != null && right.val == val) {
                count++;  // Duplicate found in right subtree
            }

            // Recursively count duplicates in the left and right subtrees
            if (left != null) {
                count += left.numberOfDuplicates();
            }
            if (right != null) {
                count += right.numberOfDuplicates();
            }

            return count;
        }
    }

}

package Trees;

public class q26_higherThanX {

    int higherThanX(int X) {
        int count = 0;

        // If current node's value is greater than X, count it and recurse on both subtrees
        if (val > X) {
            count = 1; // Count this node
            if (left != null) {
                count += left.higherThanX(X); // Search the left subtree
            }
            if (right != null) {
                count += right.higherThanX(X); // Search the right subtree
            }
        } // If current node's value is less than or equal to X, only recurse on the right subtree
        else if (val <= X) {
            if (right != null) {
                count += right.higherThanX(X); // Search the right subtree
            }
        }

        return count;
    }

}

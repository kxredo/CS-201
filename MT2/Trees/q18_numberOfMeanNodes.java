package Trees;

public class q18_numberOfMeanNodes {
/*
Write a function which returns the number of mean nodes. A node is a
 mean node if its value is the mean of its left and right children’s values.
 int numberOfMeanNodes()
 */
    int numberOfMeanNodes() {
        
        int count = 0;

        if (left != null && right != null) {
            int leftValue = left.key;
            int rightValue = right.key;

            // Check if current node's value is the mean of left and right children
            if (key == (leftValue + rightValue) / 2) {
                count = 1;
            }
        }

        // Recursively count mean nodes in left and right subtrees
        if (left != null) {
            count += left.numberOfMeanNodes();
        }
        if (right != null) {
            count += right.numberOfMeanNodes();
        }

        return count;
    }

}

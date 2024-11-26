package Trees;

public class q28_sumOfTree {

    int sumOfTree(int X) {
        int sum = 0;

        // If current node's value is less than X, include it in the sum
        if (val < X) {
            sum += val;
        }

        // If current node's value is greater than X, recurse on the left subtree
        if (val > X && left != null) {
            sum += left.sumOfTree(X);
        }

        // If current node's value is less than X, recurse on both subtrees
        if (val < X) {
            if (left != null) {
                sum += left.sumOfTree(X);
            }
            if (right != null) {
                sum += right.sumOfTree(X);
            }
        }

        return sum;
    }
}

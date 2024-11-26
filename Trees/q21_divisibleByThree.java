package Trees;

public class q21_divisibleByThree {
/*
 Write a recursive function that returns the number of nodes in a binary
 search tree whose data is divisible by 3.
 */
    int countNodesDivisibleByThree() {
        int count = 0;

        // Check if the current node's value is divisible by 3
        if (val % 3 == 0) {
            count = 1;
        }

        // Recursively count nodes in the left and right subtrees
        if (left != null) {
            count += left.countNodesDivisibleByThree();
        }
        if (right != null) {
            count += right.countNodesDivisibleByThree();
        }

        return count;
    }

}

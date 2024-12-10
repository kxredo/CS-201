package Trees;

public class q37_sumOfNodesBetween {

    /*
Write the recursive method
 int sumOfNodesBetween(int p, int q)
 in TreeNode class which returns the sum of the keys between p and q
 in the tree. Your algorithm should run in O(logN + K), where K is
 the number of nodes which have value larger than p and less than q in
 the tree.
     */

// returns sum of keys between p and q
// k is number of nodes with val > p && val < q

    int sumOfNodesBetween(int p, int q) {
        int sum = 0;

        // If the current node's value is within the range (p, q), include it in the sum
        if (val > p && val < q) {
            sum += val;
        }

        // If the current node's value is greater than p, we need to check the left subtree
        if (val > p && left != null) {
            sum += left.sumOfNodesBetween(p, q);
        }

        // If the current node's value is less than q, we need to check the right subtree
        if (val < q && right != null) {
            sum += right.sumOfNodesBetween(p, q);
        }

        return sum;
    }
}

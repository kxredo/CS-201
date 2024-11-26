package Trees;

public class q37_sumOfNodesBetween {

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

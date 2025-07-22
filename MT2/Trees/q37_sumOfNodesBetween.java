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
        
        if (data >= p && data <= q) {
            sum += data;
        }
        if (left != null && data > p) {
            sum += left.sumOfNodesBetween(p, q);
        }
        if (right != null && data < q) {
            sum += right.sumOfNodesBetween(p, q);
        }
        return sum;
    }

}

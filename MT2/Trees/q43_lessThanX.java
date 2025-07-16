package Trees;

/*
Write a recursive method in TreeNode class
 void lessThanX(int∗ a, int& index, int x)
 
 that accumulates all nodes in the binary search tree which have value
 less than x in array a. Use and modify index to store the integers. Your
 method should run in O(logN +K) time, where N is total number of
 nodes and K is the number of nodes which have value larger than x in
 the tree.
 */
public class q43_lessThanX {

    public void lessThanX(int[] a, int[] index, int x) {

        if (value >= x) {
            if (left != null) {
                left.lessThanX(a, index, x);
            }
        } else {
            a[index[0]++] = value;
            if (left != null) {
                left.lessThanX(a, index, x);
            }
            if (right != null) {
                right.lessThanX(a, index, x);
            }
        }
    }
}

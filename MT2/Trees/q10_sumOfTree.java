package Trees;

public class q10_sumOfTree {

    /*
Write a function that computes the sum of all keys in a binary search tree.
int sumOfTree()
     */
    int sumOfTree2() {
        if (this == null) {
            return 0;
        }
        int sum = key;
        if (left != null) {
            sum += left.sumOfTree();
        }
        if (right != null) {
            sum += right.sumOfTree();
        }
        return sum;
    }

    int sumOfTree() {
        if (root != null) {
            return root.sumOfTree2();
        } else {
            return 0;
        }
    }

}

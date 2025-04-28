package Trees;

public class q10_sumOfTree {

    /*
Write a function that computes the sum of all keys in a binary search tree.
int sumOfTree()
     */
    int sumOfTree2() {
        int sum = key;
        if (left != null) {
            sum += left.sumOfTree();
        }
        if (right != null) {
            sum += right.sumOfTree();
        }
        return sum;
    }

}

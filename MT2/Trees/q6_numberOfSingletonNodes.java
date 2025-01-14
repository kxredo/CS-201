package Trees;

public class q6_numberOfSingletonNodes {

    /*
    Write a function that computes the number of singleton nodes in a
 binary search tree. A node is singleton if it has only one child.
 int numberOfSingletonNodes()
     */
    public int numberOfSingletonNodes() {

        int count = 0;
        if ((left != null && right == null) || (left == null && right != null)) {
            count++;
        }

        return count + left.numberOfSingletonNodes() + right.numberOfSingletonNodes();
    }
}

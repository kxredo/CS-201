package Trees;

public class q6_numberOfSingletonNodes {

    /*
     Write a function that computes the number of full nodes in a binary
 search tree. A node is full if it has both left and right children.
 int numberOfFullNodes()
     */


    public int numberOfSingletonNodes() {

        int count = 0;
        if ((left != null && right == null) || (left == null && right != null)) {
            count++;
        }

        return count + left.numberOfSingletonNodes() + right.numberOfSingletonNodes();
    }
}

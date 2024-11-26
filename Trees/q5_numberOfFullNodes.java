package Trees;

public class q5_numberOfFullNodes {
/*
 Write a function that computes the number of full nodes in a binary
 search tree. A node is full if it has both left and right children.
 int numberOfFullNodes()
 */
    public int numberOfFullNodes() {
        if (this == null) {
            return 0;
        }

        int count = 0;
        if (left != null && right != null) {
            count++;
        }

        return count + left.numberOfFullNodes() + right.numberOfFullNodes();
    }
}

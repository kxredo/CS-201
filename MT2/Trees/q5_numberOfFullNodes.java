package Trees;

public class q5_numberOfFullNodes {
/*
 Write a function that computes the number of full nodes in a binary
 search tree. A node is full if it has both left and right children.
 int numberOfFullNodes()
 */
    public int numberOfFullNodes() {

        int count = 0;
        if (left != null && right != null) {
            count++;
        }

        if(left!=null) {
            count += left.numberOfFullNodes();
        }
        if(right!=null){
            count += right.numberOfFullNodes();
        }

        return count;
    }

}


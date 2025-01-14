package Trees;
// SOLVED IN LAB

public class q17_leftistOrRightist {

    /*
Write a function that finds the difference between the number of leftist
 nodes and rightist nodes in a binary search tree. A node is leftist
 (rightist) if it has only left (right) child.
 int leftistOrRightist ()
     */
    int leftistOrRightist() {
        
        int leftist = 0, rightist = 0;

        if (left != null && right == null) {
            leftist = 1;
        } else if (right != null && left == null) {
            rightist = 1;
        }

        if (left != null) {
            leftist += left.leftistOrRightist();
        }
        if (right != null) {
            rightist += right.leftistOrRightist();
        }

        return leftist - rightist;
    }

}

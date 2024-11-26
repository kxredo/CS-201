package Trees;

public class q16_doubleRotateRight {

    /*
     Write a function that solves case 3 without using single rotation func
tions.
 AvlNode doubleRotateRight(AvlNode k3)
     */
    AvlNode doubleRotateRight(AvlNode k3) {
        // First, perform a left rotation on k3's left child (k2)
        AvlNode k2 = k3.left;
        k3.left = k2.right;
        k2.right = k3;

        // Now, perform a right rotation on the updated k2
        AvlNode newRoot = k2.left;
        k2.left = newRoot.right;
        newRoot.right = k2;

        // Return the new root after double rotation
        return newRoot;
    }

}

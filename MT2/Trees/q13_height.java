package Trees;

public class q13_height {
/*
Write a function that determines the height of a tree.
 int height()
 */
    int height() {
        
        int leftHeight = 0;
        
        if (left != null) {
            leftHeight = left.height();
        }
        int rightHeight = 0;
        
        if (right != null) {
            rightHeight = right.height();
        }

        if (leftHeight > rightHeight) {
            return 1 + leftHeight;
        } else {
            return 1 + rightHeight;
        }
    }

}

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

    //Stack implementation
    int leftistOrRightist() {
        int leftist = 0;
        int rightist = 0;
    
        Stack stack = new Stack(100);
        TreeNode current = root;

        stack.push(new Element(current));
    
        while (!stack.isEmpty()) {
            current = stack.pop().getData();
            if (current.left != null && current.right == null) {
                leftist++;
            } else if (current.right != null && current.left == null) {
                rightist++;
            }
    
            if (current.left != null) {
                stack.push(new Element(current.left));
            }
            if (current.right != null) {
                stack.push(new Element(current.right));
            }
        }
    
        return leftist - rightist;
    }

}

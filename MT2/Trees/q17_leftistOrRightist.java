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
        int leftist = 0, rightist = 0;
    
        Stack stack = new Stack(100);
        stack.push(this);
    
        while (!stack.isEmpty()) {
            Node current = stack.pop();
    
            // Check if the current node is leftist or rightist
            if (current.left != null && current.right == null) {
                leftist++;
            } else if (current.right != null && current.left == null) {
                rightist++;
            }
    
            // Push children of the current node onto the stack
            if (current.left != null) {
                stack.push(current.left);
            }
            if (current.right != null) {
                stack.push(current.right);
            }
        }
    
        return leftist - rightist;
    }

}

package Trees;

public class q29_depthOfNode {

    /*
Write a non-recursive method in Tree class that returns the depth of
 the node containing a given data X in a binary search tree. You are not
 allowed to use any tree methods, just attributes, constructors, getters
 and setters.
 int depthOfNode(int X)
     */
    public int depthOfNode(int X) {
        int depth = 0;
        TreeNode current = root;
        
        while (current != null) {
            if (X < current.getData()) {
                current = current.getLeft();
            } else if (X > current.getData()) {
                current = current.getRight();
            } else {
                return depth; // Found the node
            }
            depth++;
        }
        return -1; // Node not found
    }

}

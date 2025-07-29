package Trees;
/*
Write a recursive method in TreeNode Class
 boolean hasPath(int[] path)
 given a binary search tree (BST) and an array of integers representing
 a potential path. This method should return true if the sequence of
 values in the path array matches a valid path from the current node
 down to a node in the BST, and false otherwise. Hint: you should
 create an extra array to forward reduced path to the children.
 */
public class q41_hasPath {
    public boolean hasPath(int[] path) {
        if (path.length == 0) {
            return true; 
        }
        
        if (path[0] != data) {
            return false; 
        }

        int[] reducedPath = new int[path.length - 1];
        System.arraycopy(path, 1, reducedPath, 0, path.length - 1);

        boolean leftHasPath = (left != null) && left.hasPath(reducedPath);
        boolean rightHasPath = (right != null) && right.hasPath(reducedPath);

        return leftHasPath || rightHasPath; // Return true if either child has the path
    }
}

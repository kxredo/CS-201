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
        if (path == null || path.length == 0) {
            return false;
        }
        // Current node must match path[0]
        if (this.value != path[0]) {
            return false;
        }
        // If this is the last value in path, we have found a valid path
        if (path.length == 1) {
            return true;
        }
        // Prepare reduced path for children
        int[] reduced = new int[path.length - 1];
        System.arraycopy(path, 1, reduced, 0, path.length - 1);

        // Try left and right children recursively
        boolean leftHas = (left != null) && left.hasPath(reduced);
        boolean rightHas = (right != null) && right.hasPath(reduced);

        return leftHas || rightHas;
    }
}

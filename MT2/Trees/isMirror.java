package Trees;

public class isMirror {
    boolean isMirror(TreeNode left, TreeNode right){
        if(left == null && right == null) {
            return true;
        }
        if(left == null || right == null) {
            return false;
        }
        return left.data == right.data && isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }
}

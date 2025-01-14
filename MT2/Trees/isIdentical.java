package Trees;

public class isIdentical {
    boolean isIdentical(TreeNode T1, TreeNode T2) {
        if(T1 == null && T2 == null) {
            return true;
        }
        if(T1 == null || T2 == null) {
            return false;
        }

        return isIdentical(T1.left, T2.left) && isIdentical(T1.right, T2.right);
    }
}

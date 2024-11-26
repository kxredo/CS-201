package Trees;

public class q13_height {

    int height() {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

}

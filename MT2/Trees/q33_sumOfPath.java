package Trees;

public class q33_sumOfPath {

    int sumOfPath(String path) {

        int sum = root.data;
        TreeNode node = root;

        for (int i = 0; i < path.length; i++) {
            if (path.charAt(i) == '0') {
                node = node.left;
            } else {
                node = node.right;
            }
            sum += node.data;
        }
        return sum;
    }
}

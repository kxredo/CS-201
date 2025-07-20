package Trees;

/*
Write the recursive method
 int [] collectNodes()
 in TreeNode class, which collects all values in all nodes in the tree in a
 sorted manner. You are not allowed to use any tree methods. You cannot use another method.
 */
import java.util.ArrayList;

public class q38_collectNodes {

    int[] collectNodes() {
        
        ArrayList<Integer> list = new ArrayList<>();
        // In-order traversal: left, root, right
        if (left != null) {
            int[] leftArr = left.collectNodes();
            for (int n : leftArr) {
                list.add(n);
            }
        }
        list.add(val);
        
        if (right != null) {
            int[] rightArr = right.collectNodes();
            for (int n : rightArr) {
                list.add(n);
            }
        }
        // Convert ArrayList to int[]
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}

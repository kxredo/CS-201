package Trees;

import java.util.ArrayList;

public class q38_collectNodes {


    private void collectNodes(ArrayList<Integer> list) {
        // Traverse the left subtree if exists
        if (left != null) {
            left.collectNodesHelper(list);
        }

        // Add current node's value to the list
        list.add(val);

        // Traverse the right subtree if exists
        if (right != null) {
            right.collectNodesHelper(list);
        }
    }
}

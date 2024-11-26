package Trees;

import java.util.ArrayList;

public class q38_collectNodes {

    int[] collectNodes() {
        ArrayList<Integer> list = new ArrayList<>();
        collectNodesHelper(list);  // Helper method to collect values recursively
        return list.stream().mapToInt(i -> i).toArray();  // Convert list to array
    }

    // Helper method to recursively collect nodes
    private void collectNodesHelper(ArrayList<Integer> list) {
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

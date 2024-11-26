package Trees;

import java.util.LinkedList;

public class q30_pathList {
    void pathList(LinkedList<Integer> l) {
        // Add the current node's value to the linked list
        l.add(val);

        // If the current node's value is odd, move to the left child (if exists)
        if (val % 2 != 0) {
            if (left != null) {
                left.pathList(l);  // Recurse on the left child
            }
        }
        // If the current node's value is even, move to the right child (if exists)
        else {
            if (right != null) {
                right.pathList(l);  // Recurse on the right child
            }
        }
    }
}

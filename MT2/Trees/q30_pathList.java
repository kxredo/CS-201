package Trees;

import java.util.LinkedList;
/*
Write a recursive method
 void pathList(LinkedList l)
 in the TreeNode class, which returns the keys on the path in the linked
 list l, where the path is defined by the current parent as follows: If the
 parent is odd, go left; otherwise go right. Assume that the function is
 called with an empty linked list for the root node.
 */
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

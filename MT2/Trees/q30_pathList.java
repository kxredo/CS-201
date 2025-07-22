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

    void pathList(LinkedList l) {
        
        l.add(data);
        
        if (data % 2 == 0) {
            if (right != null) {
                right.pathList(l);
            }
        } else {
            if (left != null) {
                left.pathList(l);
            }
        }

    }
}

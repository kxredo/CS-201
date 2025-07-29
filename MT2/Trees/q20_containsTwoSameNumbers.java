package Trees;

import org.w3c.dom.Node;

public class q20_containsTwoSameNumbers {

    /*
Write a recursive function that checks whether the binary search tree
 contains two same numbers or not.
 boolean containsTwoSameNumbers()
     */
    boolean containsTwoSameNumbers() {
        if (left == null && right == null) {
            return false; // Leaf node does not contain two same numbers
        }
        boolean found = false;
        if (left != null) {
            if (left.data == data) {
                found = true;
            } else {
                found = left.containsTwoSameNumbers();
            }
        }
        if (!found && right != null) {
            if (right.data == data) {
                found = true;
            } else {
                found = right.containsTwoSameNumbers();
            }
        }
        return found;
    }
}

package Trees;

import org.w3c.dom.Node;

public class q20_containsTwoSameNumbers {

    /*
Write a recursive function that checks whether the binary search tree
 contains two same numbers or not.
 boolean containsTwoSameNumbers()
     */
    boolean containsTwoSameNumbers() {
        return containsDuplicates(root);
    }

    private boolean containsDuplicates(Node current) {
        if (current == null) {
            return false;
        }
        if (containsDuplicates(current.left) || containsDuplicates(current.right)) {
            return true;
        }
        if (current.left != null && current.key == current.left.key) {
            return true;
        }
        if (current.right != null && current.key == current.right.key) {
            return true;
        }
        return false;
    }

}

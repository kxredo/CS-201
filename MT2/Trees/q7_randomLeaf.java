package Trees;

import java.util.Random;

import javax.swing.tree.TreeNode;

public class q7_randomLeaf {
/*
Write a function that returns a random leaf node from a binary search tree.
 Node randomLeaf()
 */
    public TreeNode randomLeaf() {
        
        if (left == null && right == null) {
            return root;
        }

        Random rand = new Random();
        return rand.nextBoolean() ? left.randomLeaf() : right.randomLeaf();
    }
}

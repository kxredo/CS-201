package Trees;

import java.util.Queue;

/*
Write a non-recursive method
 int countEvenNodes()
 in Tree class that computes and returns the number of nodes with even
 values in a binary search tree by using queue. You are only allowed to
 traverse the tree once.
 */
public class q42_countEvenNodes {

    public int countEvenNodes() {
        int count = 0;
        Queue queue = new Queue(100);
        queue.enqueue(root);
        
        while (!queue.isEmpty()) {
            TreeNode current = queue.dequeue();
            if (current.data % 2 == 0) {
                count++;
            }
            if (current.left != null) {
                queue.enqueue(new Element(current.left));
            }
            if (current.right != null) {
                queue.enqueue(new Element(current.right));
            }
        }
        return count;
    }
}

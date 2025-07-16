package Trees;

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
        Queue queue = new Queue();
        TreeNode current = head;

        while (head != null) {
            if (current.value % 2 == 0) {
                count++;
            }
            // Manually enqueue children
            if (current.left != null) {
                tail.next = new TreeNode(current.left);
                tail = tail.next;
            }
            if (current.right != null) {
                tail.next = new TreeNode(current.right);
                tail = tail.next;
            }
            head = head.next; // Manually dequeue
        }
        return count;
    }
}

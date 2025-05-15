package Trees;
/*
void accumulateLeafNodes(Queue queue)
 in TreeNode class which accumulates the contents (integer as data field)
 of all leaf nodes in queue. For queue, you are only allowed to use
 enqueue function. You should use array implementation for the queue
 in this question.
 */
public class q34_accumulateLeafNodes {

    void accumulateLeafNodes(Queue queue) {
        if (left == null && right == null) {
            queue.enqueue(new Element(data));
        }
        if (left != null) {
            left.accumulateLeafNodes(queue);
        }
        if (right != null) {
            right.accumulateLeafNodes(queue);
        }
    }
}

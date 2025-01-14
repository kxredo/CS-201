package Trees;

public class q34_accumulateLeafNodes {
// WILL NOT BE IN EXAM
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

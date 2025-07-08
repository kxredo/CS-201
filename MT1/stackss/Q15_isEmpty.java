package stackss;

public class Q15_isEmpty {

    class DoubleNode {

        int data;
        DoubleNode prev;
        DoubleNode next;

        public DoubleNode(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    class Stack {

        private DoubleNode head = null;

        public boolean isEmpty() {
            return head == null;
        }

        public void push(DoubleNode newNode) {
            if (head != null) {
                newNode.next = head;
                head.prev = newNode;
            }
            head = newNode;
            newNode.prev = null;
        }

        public DoubleNode pop() {
            if (head == null) {
                return null;
            }
            DoubleNode node = head;
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            node.next = null; // disconnect for clarity
            return node;
        }
    }
}

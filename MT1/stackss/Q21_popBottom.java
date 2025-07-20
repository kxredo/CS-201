package stackss;

public class Q21_popBottom {

    LinkedList popBottomK(int k) {
        
        Node current = top;
        Node previous = null;
        Node bottomListHead = null;
        int count = 0;
        while (current != null && count < k) {
            Node newNode = new Node(current.data);
            newNode.next = bottomListHead;
            bottomListHead = newNode;
            previous = current;
            current = current.next;
            count++;
        }
        if (previous != null) {
            previous.next = current;
        } else {
            top = null;
        }
        return bottomListHead;
    }

}

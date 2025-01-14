package LinkedLists;

public class addAfterEachNode {
    void LinkedList addAfterEachNode(int X) {
        Node current = head;

        while(current!=null) {
            Node x = new Node(X);
            x.setNext(current.next);
            current.setNext(x);
            current = x.getNext;
        }
    }
}

package LinkedLists;

public class addBeforeEachNode {
    void LinkedList addBeforeEachNode(int X) {
        
        Node tmp = new Node(0);
        tmp.setNext(head);
        Node current = head;

        while(current.next!=null) {
            Node x = new Node(X);
            x.setNext(current.next);
            current.setNext(x);
            current = x.getNext();
        }
        head = tmp.getNext();
    }
}

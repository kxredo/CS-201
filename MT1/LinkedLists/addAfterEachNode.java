package LinkedLists;
/*
Write the method which add X after each node in the singly linked list. 
void addAfterEachNode(Node X)
 */
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

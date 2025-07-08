package LinkedLists;

public class Q27_addAfterEachNode {

    /*
Write the method which add newnode after each node in the singly linked list. 
void addAfterEachNode(Node<T> newNode)
     */
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

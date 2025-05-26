package LinkedLists;

public class Q6_addToSortedList {

    /*
Given a sorted linked list, write a function to add a new integer without destroying the sortedness property.
void AddToSortedList(int x)
     */
    void AddToSortedList(int x) {
        Node newNode = new Node(x);
        if (head == null || head.data >= x) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data < x) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }
}

}

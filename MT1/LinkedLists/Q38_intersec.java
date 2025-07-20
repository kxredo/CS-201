package LinkedLists;

public class Q38_intersec {

    /*
 LinkedList intersec (LinkedList list1 , LinkedList list2 )
 to find the intersection of the elements in two sorted linked lists and
 return a new linked list. Implement the following algorithm:
 1. At the beginning of the algorithm, let say we have two nodes
 p1 and p2, showing the head nodes of the first and second lists
 respectively.
 2. Compare the contents of the nodes p1 and p2;
- If p1.data < p2.data, advance p1 pointer to show next node in its list.
- If p1.data > p2.data, advance p2 pointer to show next node in its list.
- If p1.data = p2.data, put a new node with content of p1 and advance both pointers p1 and p2 in their respective lists.

 3. Continue with step 2 until one of the p1 or p2 is null.
 You are not allowed to use any linked list methods. You are only
 allowed to use attributes, constructors, getters and setters.
 Contents of the first list
 1 3 5 7 11 12
 Contents of the second list
 1 2 6 7 9 11
 Contents of the results
 1 7 11 */

    LinkedList intersec(LinkedList list1, LinkedList list2) {
        LinkedList result = new LinkedList(); 
        Node p1 = list1.head; 
        Node p2 = list2.head;

        while (p1 != null && p2 != null) {
            if (p1.data < p2.data) {
                p1 = p1.next; 
            } else if (p1.data > p2.data) {
                p2 = p2.next;
            } else {
                Node newNode = new Node(p1.data); 

                if (result.head == null) {
                    result.head = newNode; //
                } else {
                    Node current = result.head;
                    while (current.next != null) {
                        current = current.next; 
                    }
                    current.next = newNode; 
                }
                p1 = p1.next;
                p2 = p2.next;
            }
        }
        return result;
    }

}

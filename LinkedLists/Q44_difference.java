package LinkedLists;

public class Q44_difference {
    /*
Write the static method in LinkedList class
LinkedList difference (LinkedList list1 , LinkedList list2 )
to find the difference of the elements in two sorted linked lists and return
a new linked list. The resulting list should contain those elements that
are in list1 but not in list2. Do not modify linked lists list1 and list2.
Your method should run in O(N) time. Nodes in the resulting list
should be new. You can not use any linked list methods except getters and setters.
     */
    static LinkedList difference(LinkedList list1, LinkedList list2) {
        LinkedList result = new LinkedList();
        Node p1 = list1.getHead();
        Node p2 = list2.getHead();
        Node current = null;

        while (p1 != null) {
            // If p2 is null, all remaining elements in list1 are in the result
            if (p2 == null) {
                Node newNode = new Node(p1.data);
                if (result.head == null) {
                    result.head = newNode; // Set head for the first element
                    current = result.head; // Initialize current pointer
                } else {
                    current.next = newNode; // Link the new node
                    current = current.next; // Move the current pointer
                }
                p1 = p1.next; // Move to the next node in list1
            } 
            else if (p1.data < p2.data) {
                // Element is in list1 but not in list2
                Node newNode = new Node(p1.data);
                if (result.head == null) {
                    result.head = newNode; // Set head for the first element
                    current = result.head; // Initialize current pointer
                } else {
                    current.next = newNode; // Link the new node
                    current = current.next; // Move the current pointer
                }
                p1 = p1.next; // Move to the next node in list1
            } 
            else if (p1.data > p2.data) {
                // Move to the next node in list2
                p2 = p2.next;
            } 
            else {
                // Both elements are equal, skip the element in list1
                p1 = p1.next;
                p2 = p2.next;
            }
        }
        return result; // Return the resulting list
    }
}


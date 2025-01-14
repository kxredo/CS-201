package LinkedLists;

public class Q17_intersection {

    /*
Given two sorted linked lists L1 and L2, write a function to compute L1 ∩L2.
 LinkedList intersection (LinkedList l1, LinkedList l2)
     */
    LinkedList intersection(LinkedList l1, LinkedList l2) {
        LinkedList result = new LinkedList(); // To store the intersection
        Node current1 = l1.head;
        Node current2 = l2.head;
        Node resultCurrent = null;

        // Traverse both lists
        while (current1 != null && current2 != null) {
            if (current1.data < current2.data) {
                current1 = current1.next; // Move current1 if its data is smaller
            } else if (current1.data > current2.data) {
                current2 = current2.next; // Move current2 if its data is smaller
            } else {
                // Found a common element
                Node newNode = new Node(current1.data);
                if (result.head == null) {
                    result.head = newNode; // Set as head if result is empty
                    resultCurrent = result.head;
                } else {
                    resultCurrent.next = newNode; // Append to result list
                    resultCurrent = resultCurrent.next;
                }
                current1 = current1.next;
                current2 = current2.next;
            }
        }

        return result; // Return the intersection list
    }

}

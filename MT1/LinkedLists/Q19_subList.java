package LinkedLists;

public class Q19_subList {

    /*Write a function that checks if the original list contains the elements
of the second list in the same order.
boolean subList(LinkedList sub) 
     */
    boolean subList(LinkedList sub) {

        Node current = head;

        while (current != null) {
            // Start checking for match from current node
            Node temp1 = current;
            Node temp2 = sub.head;

            // Compare nodes while they match
            while (temp1 != null && temp2 != null && temp1.data == temp2.data) {
                temp1 = temp1.next;
                temp2 = temp2.next;
            }

            // If we've reached the end of sub, it's a match
            if (temp2 == null) return true;

            current = current.next;
        }

        return false; // sub not found
    }
}

}

package LinkedLists;

public class Q4_deleteEvenIndexed {
/*
Write a function that will delete even indexed elements from a singly
 linked list.
 void deleteEvenIndexed()
 */
void deleteEvenIndexed() {
    while(head!=null){

    Node current = head;
    Node previous = null;
    int index = 0;
    
    while (current != null) {
        if (index % 2 == 0) { // Check for even index
            if (previous == null) {
                head = current.next; // Update head if the first element is even indexed
            } else {
                previous.next = current.next; // Bypass the current node
            }
        } else {
            previous = current; // Move previous pointer only if we do not delete the node
        }
        current = current.next; // Move to the next node
        index++;
    }
}
}

}

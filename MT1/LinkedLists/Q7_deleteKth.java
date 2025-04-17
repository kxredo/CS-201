package LinkedLists;

public class Q7_deleteKth {

    /*
Write a function to delete k’th node from a singly linked list.
void deleteKth(int k)
     */
    void deleteKth(int k) {
        
        Node current = head;

        while(current != null){
        // Traverse the list to find the (k-1)th node
        for (int i = 1;  i < k - 1; i++) {
            current = current.next; // Move to the next node
        }
        

        // If the (k-1)th node is found and the kth node exists
        if (current != null && current.next != null) {
            current.next = current.next.next; // Bypass the kth node
        }
    }

}

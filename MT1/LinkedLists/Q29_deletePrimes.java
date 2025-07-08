package LinkedLists;

public class Q29_deletePrimes {

    /*
Write a function that will delete all prime nodes that is their data field
is prime such as 2, 3, 5, 7, etc.
void deletePrimes()
     */
    void deletePrimes() {
        Node current = head;
        Node prev = null;

        while (current != null) {
            if ((current.data >= 2) && (current.data % 2 !=0)) {
                if (prev != null) {
                    prev.next = current.next; // Bypass the current node
                } else {
                    head = current.next; // Update head if the first node is prime
                }
            } else {
                prev = current; // Move prev pointer only if the current node is not deleted
            }
            current = current.next; // Move to the next node
        }
    }

}

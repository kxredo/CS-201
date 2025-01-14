package LinkedLists;

public class Q31_sieveOfEratosthenes {

    /*
Write the algorithm Sieve of Eratosthenes to extract prime numbers
using singly linked list. The algorithm works as follows:
- The user enters a number N.
- Put all numbers starting from 2 to N in a linked list.
- While the linked list contains numbers
    – Remove the first element p from the linked list. Print it (It is prime).
    – Remove all elements from the linked list which are divisible by p. Do not print them. 
     */
    void sieveOfEratosthenes(int N) {
        // Create a linked list and populate it with numbers from 2 to N
        LinkedList numbers = new LinkedList();
        for (int i = 2; i <= N; i++) {
            numbers.add(i); // Assuming a method add(int data) exists in LinkedList class
        }

        Node current = numbers.head; // Start from the head of the list

        // While the linked list contains numbers
        while (current != null) {
            int p = current.data; // Get the first element
            System.out.print(p + " "); // Print it as a prime

            // Remove the first element (already printed)
            numbers.deleteNode(p); // Assuming a method deleteNode(int data) exists

            // Create a temporary node to traverse the list for removal
            Node temp = numbers.head;
            Node prev = null;

            // Remove all elements divisible by p
            while (temp != null) {
                if (temp.data % p == 0) { // Check divisibility
                    if (prev != null) {
                        prev.next = temp.next; // Bypass the divisible node
                    } else {
                        numbers.head = temp.next; // Update head if the first node is divisible
                    }
                } else {
                    prev = temp; // Only move prev if we are not deleting the node
                }
                temp = temp.next; // Move to the next node
            }

            current = numbers.head; // Move to the next number in the updated list
        }
    }

}

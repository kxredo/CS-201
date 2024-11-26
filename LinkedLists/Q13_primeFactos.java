package LinkedLists;

public class Q13_primeFactos {

    /*
Given an integer N, write a function which returns the prime factors of N as singly linked list.
LinkedList primeFactors(int N)
     */
    public LinkedList primeFactors(int N) {

        LinkedList factors = new LinkedList();
Node current = null; // Initialize a pointer to track the current node in the linked list

// Iterate from 2 to N/i, where i is the current factor
for (int i = 2; i <= N / i; i++) {
    // While i divides N, add i to the factors list
    while (N % i == 0) {
        Node newNode = new Node(i); // Create a new node with the current factor i
        
        // If the factors list is empty, set the new node as the head
        if (factors.head == null) {
            factors.head = newNode; // Set the head to the new node
            current = factors.head; // Update current to the head
        } else {
            current.next = newNode; // Link the new node to the current node
            current = current.next; // Move the current pointer to the new node
        }
        
        N /= i; // Divide N by the current factor i to reduce it
    }
}

// If N is still greater than 1, it means N is a prime factor
if (N > 1) {
    Node newNode = new Node(N); // Create a new node for the remaining prime factor
    
    // If the factors list is empty, set the new node as the head
    if (factors.head == null) {
        factors.head = newNode; // Set the head to the new node
    } else {
        current.next = newNode; // Link the new node to the end of the list
    }
}

return factors;
    }
}

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
            if (isPrime(current.data)) { // Check if the current node's data is prime
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

// Helper function to check if a number is prime
    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Not prime if divisible by i

                    }}
        return true; // Prime if no divisors found
    }

}

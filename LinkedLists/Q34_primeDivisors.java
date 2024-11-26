package LinkedLists;

public class Q34_primeDivisors {
/*
Write the algorithm
 LinkedList primeDivisors(int N)
 in the LinkedList class which works as follows:
 • Creates a temporary linked list primes, which stores the prime
 numbers until N.
 • Using primes returns all prime divisors (with repeating) of N.
 Let say N = 200, the function will return 2, 2, 2, 5, 5. You are not
 allowed to use any array in the function.
 */
LinkedList primeDivisors(int N) {
    LinkedList primes = new LinkedList(); // To store prime numbers
    LinkedList divisors = new LinkedList(); // To store prime divisors of N

    // Step 1: Find all prime numbers up to N using the Sieve of Eratosthenes
    for (int i = 2; i <= N; i++) {
        boolean isPrime = true;

        // Check if i is prime
        for (Node current = primes.head; current != null; current = current.next) {
            int prime = current.data;
            if (prime * prime > i) {
                break; // No need to check beyond the square root
            }
            if (i % prime == 0) {
                isPrime = false; // i is not prime
                break;
            }
        }

        // If i is prime, add it to the primes list
        if (isPrime) {
            Node newNode = new Node(i);
            if (primes.head == null) {
                primes.head = newNode; // If the list is empty
            } else {
                Node last = primes.head;
                while (last.next != null) {
                    last = last.next; // Move to the last node
                }
                last.next = newNode; // Add new prime node
            }
        }
    }

    // Step 2: Find the prime divisors of N using the primes list
    for (Node current = primes.head; current != null; current = current.next) {
        int prime = current.data;

        // Divide N by prime until it's no longer divisible
        while (N % prime == 0) {
            Node divisorNode = new Node(prime);
            if (divisors.head == null) {
                divisors.head = divisorNode; // If the list is empty
            } else {
                Node last = divisors.head;
                while (last.next != null) {
                    last = last.next; // Move to the last node
                }
                last.next = divisorNode; // Add new divisor node
            }
            N /= prime; // Reduce N
        }
    }

    return divisors; // Return the list of prime divisors
}

}

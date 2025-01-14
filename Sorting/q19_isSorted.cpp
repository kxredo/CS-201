Suppose you are given a linked list of N integers to be sorted. Write
 an O(N) algorithm that checks if the linked list is already sorted.
 boolean isSorted(LinkedList A)

// Function to check if the linked list is sorted
    static boolean isSorted(LinkedList A) {
        if (A.head == null || A.head.next == null) {
            // An empty or single-node list is always sorted
            return true;
        }

        Node current = A.head;
        while (current.next != null) {
            if (current.data > current.next.data) {
                return false; // Found an unsorted pair
            }
            current = current.next;
        }

        return true; // No unsorted pairs found
    }
}
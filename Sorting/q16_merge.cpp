Suppose you are given two linked lists of sorted integers. Write an O(N)
 algorithm that merges these two linked lists such that the resulting
 linked list is also sorted.
 LinkedList merge(LinkedList A, LinkedList B)

// Function to merge two sorted linked lists
    static LinkedList merge(LinkedList A, LinkedList B) {
        LinkedList result = new LinkedList();
        Node dummy = new Node(0); // Temporary dummy node
        Node tail = dummy;

        Node a = A.head;
        Node b = B.head;

        // Merge the lists
        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }

        // Append remaining nodes from either list
        if (a != null) {
            tail.next = a;
        } else {
            tail.next = b;
        }

        // Set the result's head to the merged list
        result.head = dummy.next;
        return result;
    }
    }


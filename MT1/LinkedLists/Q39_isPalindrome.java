package LinkedLists;

public class Q39_isPalindrome {

    /*
     Write the method
 boolean isPalindrom()
 which returns true if the doubly linked list is palindrom. Implement
 the following algorithm:
 •
 •
 •
 At the beginning of the algorithm, we have two pointers p1 and
 p2, which shows the beginning and the end of the list respectively.
 Compare the contents of the pointers, if they are different, return
 false, otherwise advance the pointers p1 to next, p2 to previous.
 The algorithm finishes either p1 = p2 or p1.next = p2, in which
 case the method returns true.
 You are not allowed to use any doubly linked list methods. You are
 allowed to use attributes, constructors, getters and setters.
     */
    boolean isPalindrom() {
        if (head == null) {
            return true; // An empty list is considered a palindrome
        }
        Node p1 = head; // Pointer to the beginning of the list
        Node p2 = head; // Pointer to traverse to the end

        // Move p2 to the last node of the list
        while (p2.next != null) {
            p2 = p2.next;
        }

        // Compare elements from the front and back
        while (p1 != p2 && p1.next != p2) {
            if (p1.data != p2.data) {
                return false; // If mismatch, it's not a palindrome
            }
            p1 = p1.next; // Move p1 to the next node
            p2 = p2.prev; // Move p2 to the previous node
        }

        return true; // All corresponding elements matched, it's a palindrome
    }

}

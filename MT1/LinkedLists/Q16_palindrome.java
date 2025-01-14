package LinkedLists;

public class Q16_palindrome {

    /*
Write a function that determines if a singly link list is palindrome, that
is, it is equal its reverse.
boolean palindrom()
     */
    boolean palindrome() {
        // Step 1: Find the middle of the linked list
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the linked list
        Node prev = null;
        Node current = slow;

        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        // Step 3: Compare the first half and the reversed second half
        Node firstHalf = head;
        Node secondHalf = prev; // Start from the head of the reversed second half

        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                return false; // Not a palindrome
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true; // The list is a palindrome
    }

}

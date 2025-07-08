package LinkedLists;

import java.awt.HeadlessException;

public class Q33_containsOnlyDuplicates {

    /*
Write a method which returns true if the singly linked list only contains
 duplicates, that is, every datum (number) occurs only twice. Impor
tant warning, the duplicate elements may not be adjacent. You are not
 allowed to use any singly linked list methods, just attributes, construc
tors, getters and setters.
 boolean containsOnlyDuplicates()
     */
    public boolean containsOnlyDuplicates() {
        int count = 0;
        Node current = head;
        Node temp = head;

        while (current != null) {
            while (temp != null) {
                if (temp.data == current.data) {
                    count++;
                }
                temp = temp.next;
            }
            if (count != 2) {
                return false; // If any element does not occur exactly twice
            }
            current = current.next;
        }
        return true; // All elements occur exactly twice
    }
}


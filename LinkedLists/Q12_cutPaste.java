package LinkedLists;

public class Q12_cutPaste {

    /*
Write a function that will cut-and-paste of one part of a doubly linked list into another part of another doubly linked list. Assume that the starting point of the cut, the ending point of the copy, and the starting point of the paste are given as parameters.
void cutPaste(DoubleNode first, DoubleNode last, DoubleNode paste)
     */
    head ;

    public void cutPaste(DoubleNode first, DoubleNode last, DoubleNode paste) {
        if (first == null || last == null || paste == null) {
            return; // If any of the nodes are null, do nothing
        }

        // Detach the segment from the first list
        if (first.prev != null) {
            first.prev.next = last.next;
        }
        if (last.next != null) {
            last.next.prev = first.prev;
        }

        // Attach the segment to the second list at the paste position
        DoubleNode pasteNext = paste.next;
        paste.next = first;
        first.prev = paste;
        last.next = pasteNext;
        if (pasteNext != null) {
            pasteNext.prev = last;
        }
    }
}

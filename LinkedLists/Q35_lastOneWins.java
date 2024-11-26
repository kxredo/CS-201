package LinkedLists;

public class Q35_lastOneWins {

    /*
Write the algorithm
 Node∗ 
lastOneWins(int k)
 in the LinkedList class which works as follows:
 •Delete every k’th element from the list.
 •When you get the end of the list, return to the first element, as if
 the list is circular.
 •Return the remaining node.
Let say the list is 1 2 3 4 5 6, and k = 2, then 2, 4, 6, 3, 1 will be deleted, 5 remains.
     */
    Node LinkedList

    lastOneWins(int k) {
        Node tmp = head;
        Node previous = null;
        while (head != tail) {
            int i = 1;
            while (i < k) {
                previous = tmp;
                tmp = tmp.getNext();
                if (tmp == null) {
                    previous = null;
                    tmp = head;
                }
                i++;
            }
            if (previous == null) {
                head = head.getNext();
            } else {
                previous = setNext(tmp = getNext());
            }
            if (tmp == tail) {
                tail = previous;
            }
            tmp = tmp.getNext();
                if (tmp == null) {
                    tmp = head;
                }
            }
            return head;
        }
    }



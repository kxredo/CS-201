package LinkedLists;

public class Q14_removeDivisibleByInt {

    /*
Write a function that will delete all nodes whose contents are divisible by N. The function will also return the deleted nodes as a new linkedlist.
LinkedList removeDivisibleByN(int N)
     */
    public LinkedList removeDivisibleByN(int N) {
        LinkedList removedList = new LinkedList();
        Node current = head;
        Node prev = null;
        Node removedCurrent = null;

        while (current != null) {
            if (current.data % N == 0) {
                // Remove the node from the original list
                if (prev != null) {
                    prev.next = current.next;
                } else {
                    head = current.next;
                }

                // Add the removed node to the new list
                if (removedList.head == null) {
                    removedList.head = current;
                    removedCurrent = removedList.head;
                } else {
                    removedCurrent.next = current;
                    removedCurrent = removedCurrent.next;
                }
                Node temp = current.next;
                current.next = null; // Clear the reference to help garbage collection
                current = temp;
            } else {
                prev = current;
                current = current.next;
            }
        }

        return removedList;
    }
}

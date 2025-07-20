package LinkedLists;

public class Q41_deleteEven {
    void deleteEven() {
        Node current = head; 
        Node prev = null; 

        while (current != null) {
            if (current.data % 2 == 0) { 
                if (prev == null) {
                    head = current.next;
                } else {
                    prev.next = current.next;
                }
                current = current.next; 
            } else {
                prev = current;
                current = current.next;
            }
        }
}
}

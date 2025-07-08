package LinkedLists;

public class Q30_deleteBetween {
/*
Write a linear time method to delete the nodes indexed between p and q (including p’th and q’th items) from a singly linked list.
void deleteBetween(int p, int q)
 */

    void deleteBetween(int p, int q){
        Node current = head;
        int index = 0;

        while(current!=null){
            if(index >=p && index <=q){
                if(current.prev!=null){
                    current.prev.next = current.next; // Bypass the current node
                } else {
                    head = current.next; // Update head if the first node is removed
                }
                if(current.next != null){
                    current.next.prev = current.prev; // Bypass the current node
                }
            } else {
                current = current.next;
            }
            index++;
        }
    }

}

package LinkedLists;

public class Q40_remove {
/*
void remove(const LinkedList& list2)
 which removes the nodes that appear in the list2 from the original
 list. You are not allowed to use any methods from the LinkedList
 class. You can assume both the original list and list2 do not contain
 duplicate elements. Do not modify list2. Your method should run in
 O(N2) time.
 */
// Method to remove nodes that appear in list2
void remove(LinkedList list2) {
    Node p1 = head;
    Node p2 = list2.head;
    Node prev = null;
    
    while (current != null) {
        boolean found = false;
        while (p2 != null) {
            if (p1.data == p2.data) {
                found = true;
                break;
            }
            p2 = p2.next;
        }
        if (found) {
            // Remove current node
            if (prev == null) {
                head = current.next;
                current = head;
            } else {
                prev.next = current.next;
                current = current.next;
            }
        } else {
            prev = current;
            current = current.next;
        }
    }
}
}


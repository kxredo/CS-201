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
    Node current = head; // Pointer to traverse the original list

    while (current != null) {
        Node toDelete = null; // Pointer to mark the node for deletion
        Node list2Current = list2.head; // Pointer to traverse list2

        // Check if the current node in the original list exists in list2
        while (list2Current != null) {
            if (current.data == list2Current.data) {
                toDelete = current; // Mark for deletion if found in list2
                break; // No need to check further in list2
            }
            list2Current = list2Current.next; // Move to the next node in list2
        }

        // If a node to delete is found, remove it from the original list
        if (toDelete != null) {
            // If the node to delete is the head
            if (toDelete == head) {
                head = head.next; // Move head to the next node
                current = head; // Set current to the new head
            } else {
                // Traverse to find the previous node
                Node prev = head;
                while (prev.next != toDelete) {
                    prev = prev.next;
                }
                // Remove the node from the list
                prev.next = toDelete.next; // Bypass the node to delete
                current = prev.next; // Move current to the next node after deletion
            }
        } else {
            current = current.next; // Move to the next node if no deletion occurred
        }
    }
}
}


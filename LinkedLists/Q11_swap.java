package LinkedLists;

public class Q11_swap {
/*
Write a function to swap two nodes in a doubly linked list. You are not allowed to swap the contents of the nodes.
void swap(DoubleNode first, DoubleNode second)
 */
    
 public void swap(DoubleNode first, DoubleNode second) {
    if (first == null || second == null || first == second) {
        return; // No need to swap if either node is null or they are the same node
    }

    // Swap the previous pointers
    DoubleNode tempPrev = first.prev;
    first.prev = second.prev;
    second.prev = tempPrev;

    // Swap the next pointers
    DoubleNode tempNext = first.next;
    first.next = second.next;
    second.next = tempNext;

    // Fix the previous pointers of the next nodes
    if (first.next != null) {
        first.next.prev = first;
    }
    if (second.next != null) {
        second.next.prev = second;
    }

    // Fix the next pointers of the previous nodes
    if (first.prev != null) {
        first.prev.next = first;
    } else {
        head = first; // Update head if first is now the head
    }
    if (second.prev != null) {
        second.prev.next = second;
    } else {
        head = second; // Update head if second is now the head
    }
}
}


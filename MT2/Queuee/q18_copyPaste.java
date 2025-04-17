package Queuee;
import java.util.Queue;

/*
Write the method for array implementation
 void copyPaste(Queue src, int index)
 which copies all the elements of the src queue and inserts to the queue at
 position index. You are not allowed to use enqueue, dequeue, isEmpty
 functions. You can assume the destination queue has enough space
 for insertion. Your method should run in O(N) time. Hint: Start by
 counting the number of positions to shift for opening up space for the
 elements of src.
 */
public class q18_copyPaste {

    public void copyPaste(Queue src, int index) {
        int srcSize = src.size;             // Size of the source queue
        int[] srcArray = src.array;         // Array of the source queue
    
        // Step 1: Shift elements in the destination queue to create space for src
        for (int i = size - 1; i >= index; i--) {
            array[i + srcSize] = array[i];
        }
    
        // Step 2: Copy elements from src to the destination at the specified index
        for (int i = 0; i < srcSize; i++) {
            array[index + i] = srcArray[i];
        }
    
        // Step 3: Update the size of the destination queue
        size = size + srcSize;
    }

    // Linked List
    public void copyPaste(Queue src, int index) {
        Node current = head; // Head of the destination queue
        Node srcHead = src.head;      // Head of the source queue
        Node srcTail = src.tail;      // Tail of the source queue
        int srcSize = src.size;       // Size of the source queue
    
            // Traverse to the node before the index
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            // Connect src queue to destination queue
            srcTail.next = current.next;
            current.next = srcHead;
        }
    
        // Update size of the destination queue
        size += srcSize;
    }
}

package LinkedLists;

public class Q8_deleteBefore {

    /*
Given node X, write a function to delete the node before it.
void deleteBefore(DoubleNode X)
     */
    void deleteBefore(DoubleNode X) {
        if (X == null || X.prev == null) {
            return; // Check if X is null or there is no node before X
        }
        DoubleNode toDelete = X.prev; // The node to delete is the one before X

        if (toDelete.prev != null) {
            toDelete.prev.next = X; // Bypass the node to delete
        } else {
            head = X; // Update head if the toDelete is the first node
        }

        X.prev = toDelete.prev; // Update the previous pointer of X
    }

}

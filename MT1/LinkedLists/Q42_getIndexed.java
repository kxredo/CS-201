package LinkedLists;

public class Q42_getIndexed {
    LinkedList getIndexed(LinkedList list) {
        LinkedList result = new LinkedList(); // New linked list to store results
        Node currentResult = null; // Pointer for the result list
        Node currentIndices = list.head; // Pointer for the index list
        Node currentOriginal = head; // Pointer for the original list
        int index = 1; // Start index at 1

        while (currentIndices != null) {
            int targetIndex = currentIndices.data; // Get the target index from the indices list
            while (currentOriginal != null && index < targetIndex) {
                currentOriginal = currentOriginal.next; // Move forward in the original list
                index++; // Increment the current index
            }

            // If the target index is valid (i.e., within the length of the original list)
            if (currentOriginal != null && index == targetIndex) {
                // Create a new node with the current original node's data
                Node newNode = new Node(currentOriginal.data);
                if (result.head == null) {
                    result.head = newNode; // Set head if it's the first element
                    currentResult = result.head; // Initialize currentResult
                } else {
                    currentResult.next = newNode; // Link the new node to the result list
                    currentResult = currentResult.next; // Move currentResult forward
                }
            }
            // Move to the next index in the indices list
            currentIndices = currentIndices.next; 
            index = 1; // Reset index for the next target index
            currentOriginal = head; // Reset to the start of the original list
        }

        return result; // Return the new linked list with the indexed elements
    }
}


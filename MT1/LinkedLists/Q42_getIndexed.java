package LinkedLists;

public class Q42_getIndexed {
    LinkedList getIndexed(LinkedList list) {
        LinkedList result = new LinkedList(); 
        Node currentResult = null;
        Node currentIndices = list.head; 
        Node currentOriginal = head; 
        int index = 1; 

        while (currentIndices != null) {
            int targetIndex = currentIndices.data; 
            while (currentOriginal != null && index < targetIndex) {
                currentOriginal = currentOriginal.next; 
                index++; 
            }
            if (currentOriginal != null && index == targetIndex) {
                
                Node newNode = new Node(currentOriginal.data);
                if (result.head == null) {
                    result.head = newNode; // Set head if it's the first element
                    currentResult = result.head; // Initialize currentResult
                } else {
                    currentResult.next = newNode; // Link the new node to the result list
                    currentResult = currentResult.next; // Move currentResult forward
                }
            }
            currentIndices = currentIndices.next; 
            index = 1; 
            currentOriginal = head; 
        }
        return result; // Return the new linked list with the indexed elements
    }
}


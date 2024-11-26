package LinkedLists;

public class Q19_subList {

    /*Write a function that checks if the original list contains the elements
of the second list in the same order.
boolean subList(LinkedList sub) 
     */
    boolean subList(LinkedList sub) {
        Node currentMain = head;        // Start with the head of the original list
        Node currentSub = sub.head;     // Start with the head of the sub list

        // Traverse the original list
        while (currentMain != null) {
            Node tempMain = currentMain;
            Node tempSub = currentSub;

            // Check if sub list matches from the current position
            while (tempMain != null && tempSub != null && tempMain.data == tempSub.data) {
                tempMain = tempMain.next;
                tempSub = tempSub.next;
            }

            // If we reached the end of the sub list, a match was found
            if (tempSub == null) {
                return true;
            }

            currentMain = currentMain.next; // Move to the next node in the main list
        }

        return false; // No match found
    }

}

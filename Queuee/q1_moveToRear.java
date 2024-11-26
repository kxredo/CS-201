
import stackss.Element;

public class q1_moveToRear {

    /*

     */
    // Array-Based Queue Implementation
    public void moveToRear() {
        if (isEmpty()) {
            return; // Queue is empty
        }

        Element temp = array[first]; // temp is in 1st index
        // Shift elements to the left, starting from the second element
        for (int i = first + 1; i <= last; i++) { 
            array[i - 1] = array[i]; 
        }

        // Move the removed element to the rear
        array[last] = temp;
        last = (last + 1) % N;
    }

// Linked List implementation
    public void moveToRear() {
        if (isEmpty()) {
            return; // Queue is empty
        }

        Node temp = first;
        first = first.next;
        last.next = temp;
        temp.next = null;
        last = temp;
    }
}

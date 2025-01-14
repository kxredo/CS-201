
import java.util.LinkedList;

import org.w3c.dom.Node;

public class q26_isValid {

    public boolean isValid() {
        for (int i = 0; i < table.length; i++) {
            Node current = table[i];
            while (current != null) {
                Node runner = current.next;
                while (runner != null) {
                    if (runner.data == current.data) {
                        return false; // Duplicate found
                    }
                    runner = runner.next;
                }
                current = current.next;
            }
        }
        return true; // No duplicates found
    }
    
    // Another answer
    public boolean isValid() {
        for (int i = 0; i < N; i++) {
            LinkedList list = table[i];
            Node current = list.getHead();
            while (current != null) {
                int value = current.getValue();
                Node runner = current.getNext();
                while (runner != null) {
                    if (runner.getValue() == value) {
                        return false; // Duplicate found
                    }
                    runner = runner.getNext();
                }
                current = current.getNext();
            }
        }
        return true; // No duplicates found
    }

}

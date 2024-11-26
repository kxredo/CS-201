
import java.util.LinkedList;

import org.w3c.dom.Node;
// WILL NOT BE IN EXAM

public class q21_perfectMap {
    public boolean perfectMap() {
        for (int i = 0; i < table.length; i++) {
            // Check if the linked list at this index has more than one element
            if (table[i] != null) {
                // If there's more than one element in the linked list, return false
                if (table[i].next != null) {
                    return false;
                }
            }
        }
        return true;
    }


public class Hash {

    public boolean perfectMap() {
        for (int i = 0; i < table.length; i++) {
            LinkedList list = table[i];
            if (list.getHead() != null && list.getHead().getNext() != null) {
                return false;
            }
        }
        return true;
    }
}

}

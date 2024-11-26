
import java.util.LinkedList;

import org.w3c.dom.Node;

public class q16_deleteAll {

    public void deleteAll(int X) {
        int address = hashFunction(X);
        while (table[address] != null) {
            if (!deleted[address] && table[address].getData() == X) {
                deleted[address] = true;
            }
            address = (address + 1) % N;
        }
    }

    public void deleteAll(int X) {
        for (int i = 0; i < table.length; i++) {
            Node current = table[i].getHead();
            Node previous = null;
            while (current != null) {
                if (current.getData() == X) {
                    if (previous == null) {
                        table[i].deleteFirst();
                    } else {
                        previous.setNext(current.getNext());
                    }
                } else {
                    previous = current;
                }
                current = current.getNext();
            }
        }
    }

}

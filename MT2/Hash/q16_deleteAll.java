
import java.util.LinkedList;

import org.w3c.dom.Node;

public class q16_deleteAll {
/*
Write a method that deletes all elements having value X. Assume also
 that X can exist more than once in the hash table. Write the function
 for both array and linked list implementations. For array implemen
tation assume that linear probing is used as the collision strategy. Do
 not use any class or external methods except hashFunction.
 void deleteAll (int X)
 */
    public void deleteAll(int X) {
        int index = hashFunction(X);
        while (table[index] != null) {
            if (!deleted[index] && table[index].getData() == X) {
                deleted[index] = true;
            }
            index = (index + 1) % N;
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

    int index = hashFunction(X);
    while(table[index]!=null){
        if(table[index]==X){
            table[index]==null;
        }
    }

}

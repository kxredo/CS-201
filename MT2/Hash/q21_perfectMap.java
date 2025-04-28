
import java.util.LinkedList;

/*
Write the method
 boolean perfectMap()
 that returns true if the hash table contains one node at maximum per
 linked list in separate chaining, otherwise it returns false.
 */

public class q21_perfectMap {
    for(int i = 0; i < N; i++){
        LinkedList list = table[i];
        if(list.head != null && list.head.next != null){
            return false;
        }
    }
    return true;
}


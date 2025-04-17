
import java.util.LinkedList;

import org.w3c.dom.Node;

public class q21_perfectMap {
    for(int i = 0; i < N; i++){
        LinkedList list = table[i];
        if(list.head != null && list.head.next != null){
            return false;
        }
    }
    return true;
}


package stackss;
import java.util.Stack;
public class Q4_enlarge {
    
    /*
For array representation, write a function that enlarges the stack when
 it is full. The new stack will hold two times more than the original
 stack.
 void enlarge()
     */
    void enlarge() {
        int newCapacity = data.length * 2;
        int[] newData = new int[newCapacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
}
    
}
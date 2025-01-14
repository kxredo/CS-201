
package stackss;

import java.util.Stack;

import org.w3c.dom.Node;

/*
Write a function which pops the last two items of a stack and returns
 the product of those two popped numbers. You are not allowed to use
 pop, push functions. Write the function for both link list and array
 implementations.
 int multiply()
 */
public class multiplyQ9 {
    
        public int multiplyArr() {
            
                int last = arr[top];
                int secondLast = arr[top - 1];
                top -= 2; // Manually adjusting the top pointer
                return last * secondLast;
            }
        }
    
    
    
    public int multiplyLL() {
        
            int last = top.data;
            Node temp = top;
            top = top.next;
            temp.next = null; // Disconnect the node
            temp = null; // Help GC

            int secondLast = top.data;
            temp = top;
            top = top.next;
            temp.next = null; // Disconnect the node
            temp = null; // Help GC

            return last * secondLast;
        }
    }

    
}
}

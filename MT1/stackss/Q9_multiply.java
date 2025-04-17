
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
public class Q9_multiply {
    
        public int multiplyArr() {
            
                int a = arr[top];
                int b = arr[top - 1];
                top -= 2; // Manually adjusting the top pointer
                return a * b;
            }
        }
    
    
    
    public int multiplyLL() {
        
        int a = top.data;
        int b = top.next.data;
        top = top.next.next; // Move top pointer to effectively "pop" the two elements
        return a * b;
        }
    }

    
}
}

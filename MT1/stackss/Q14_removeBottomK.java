/*Write a function which removes only the K bottom elements of the
 stack.
 void removeBottomK(int K)
 */
public class Q14_removeBottomK {
    public void removeBottomK(int k) {
        
        // Create temporary stack
        Stack<Integer> tempStack = new Stack<>();
        
        // Calculate number of elements to keep
        int elementsToKeep = size - k;
        
        // Move elements to keep to temporary stack
        for (int i = 0; i < elementsToKeep; i++) {
            tempStack.push(pop());
        }
        
        // Clear the remaining K elements (they will be removed)
        while (!isEmpty()) {
            pop();
        }
        
        // Restore elements from temporary stack
        while (!tempStack.isEmpty()) {
            push(tempStack.pop());
        }
    }

    //2nd way
    void removeBottomK_part2(int K) {
        Stack<Integer> tempStack = new Stack<>();
        int size = 0;
    
        // Count the total number of elements in the stack
        while (!isEmpty()) {
            tempStack.push(pop());
            size++;
        }
    
        // Push back only the elements above the bottom K elements
        int elementsToKeep = size - K;
        while (!tempStack.isEmpty()) {
            int top = tempStack.pop();
            if (elementsToKeep > 0) {
                push(top);
                elementsToKeep--;
            }
        }
    }
    
}

public class q4_hashFunction {

    public int hashFunction(Stack c) {
        int sum = 0;
        // Use a temporary stack to sum elements without modifying the original stack
        Stack tempStack = new Stack();

        // Pop all elements, sum their keys, and push them onto the temporary stack
        while (!c.isEmpty()) {
            int elementKey = c.pop(); // Assuming Stack.pop() returns the element's key
            sum += elementKey;
            tempStack.push(elementKey); // Assuming Stack.push() takes an int key
        }

        // Restore the original stack from the temporary stack
        while (!tempStack.isEmpty()) {
            c.push(tempStack.pop());
        }

        return hashFunction(sum); // Use the existing int hash function for the sum
    }
}

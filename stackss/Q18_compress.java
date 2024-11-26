package stackss;

public class Q18_compress {

    public void compress() {
        LinkedListStack<T> tempStack = new LinkedListStack<>();
        T lastPopped = null;

        while (!isEmpty()) {
            T current = pop();
            if (lastPopped == null || !current.equals(lastPopped)) {
                tempStack.push(current); 
            }
            lastPopped = current;
        }
        while (!tempStack.isEmpty()) {
            push(tempStack.pop());
        }
    }

}

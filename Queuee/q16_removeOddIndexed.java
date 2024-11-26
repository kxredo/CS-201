package Queuee;

// This question will not come 
import java.util.Queue;

public class q16_removeOddIndexed {

    public void removeOddIndexed() {
        Queue tempQueue = new Queue();

        // Move even-indexed elements to the temp queue
        while (!isEmpty()) {
            Element element = dequeue();
            if (size % 2 == 0) {
                tempQueue.enqueue(element);
            }
        }

        // Move elements back from the temp queue to the original queue
        while (!tempQueue.isEmpty()) {
            enqueue(tempQueue.dequeue());
        }
    }
}

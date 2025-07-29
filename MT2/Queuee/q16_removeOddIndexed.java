package Queuee;

// This question will not come 
import java.util.Queue;

public class q16_removeOddIndexed {

    /*
which removes only the odd indexed (1, 3, . . .) elements from the
 queue. The first element has index 1. You are only allowed to use
 enqueue, dequeue, isEmpty functions. You should use external
 queue. You are not allowed to use any queue attributes such as first,
 last, array etc. You can solve the question with any queue implemen
tation.
     */
    public void removeOddIndexed() {
        Queue tempQueue = new Queue();

        while (!isEmpty()) {
            Element element = dequeue();
            if (size % 2 == 0) {
                tempQueue.enqueue(element);
            }
        }

        while (!tempQueue.isEmpty()) {
            enqueue(tempQueue.dequeue());
        }
    }
}

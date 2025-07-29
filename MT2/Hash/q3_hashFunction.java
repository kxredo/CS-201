
import java.util.Queue;

/*
 Write an hash function that maps a queue into an hashvalue.Assume
 that the hash value of a queue can be obtained first by summing up
 the key values of the elements in the queue and then hashing thesum.
 int hashFunction(Queuek)
 */
public class q3_hashFunction {

    public int hashFunction(Queue k) {
        int sum = 0;
        Queue tempQueue = new Queue();

        // Dequeue all elements, sum their keys, and enqueue them into the temporary queue
        while (!k.isEmpty()) {
            int elementKey = k.dequeue();
            sum += elementKey;
            tempQueue.enqueue(elementKey);
        }

        // Restore the original queue from the temporary queue
        while (!tempQueue.isEmpty()) {
            k.enqueue(tempQueue.dequeue());
        }
        
        return hashFunction(sum); // Use the existing hash function for the sum
    }
}

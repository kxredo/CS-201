package Queuee;
// THIS QUESTION WILL NOT COME 
import java.util.Queue;

public class q18_copyPaste {

    public void copyPaste(Queue src, int index) {
        if (index < 1 || index > size + 1) {
            throw new IllegalArgumentException("Invalid index");
        }

        // Calculate the number of positions to shift elements to the right
        int shift = src.size();

        // Shift elements to the right, starting from the last element
        for (int i = last - 1; i >= (first + index - 1) % N; i--) {
            array[i + shift] = array[i];
        }

        // Copy elements from the source queue
        int srcIndex = 0;
        for (int i = (first + index - 1) % N; i < (first + index + src.size() - 1) % N; i++) {
            array[i] = src.array[srcIndex++];
        }

        last = (last + shift) % N;
        size += src.size();
    }
}

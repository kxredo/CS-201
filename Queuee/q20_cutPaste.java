package Queuee;

import java.util.Queue;

public class q20_cutPaste {

    public void cutPaste(Queue dest, int p, int q) {

        // Calculate the number of elements to be copied
        int numElementsToCopy = q - p + 1;

        // Shift elements to the left to create space for the copied elements
        for (int i = (first + q) % N; i <= last; i++) {
            array[(i - numElementsToCopy) % N] = array[i % N];
        }

        // Copy the elements to the destination queue
        int destIndex = dest.last;
        for (int i = p - 1; i < q; i++) {
            dest.array[(destIndex + 1) % dest.N] = array[(first + i) % N];
            destIndex = (destIndex + 1) % dest.N;
        }

        // Update the last index and size of the source queue
        last = (last - numElementsToCopy) % N;
        size -= numElementsToCopy;

        // Update the last index and size of the destination queue
        dest.last = destIndex;
        dest.size += numElementsToCopy;
    }
}

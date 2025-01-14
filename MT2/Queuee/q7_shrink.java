package Queuee;

import stackss.Element;

public class q7_shrink {

    public void shrink(int M) {
        // Create a new array with the specified size M
        Element[] newArray = new Element[M];

        // Calculate the current size of the queue
        int size = (last - first + N) % N;

        // Copy the elements from the old array to the new array
        for (int i = 0; i < size; i++) {
            newArray[i] = array[(first + i) % N];
        }

        // Update the array reference to the new array
        array = newArray;

        // Reset the first and last indices
        first = 0;
        last = size;

        // Update the maximum capacity
        N = M;
    }
}

package Queuee;

public class q11_deleteKth {
/*
Write a function that deletes the element in the K’th (K ≥ 0) position
 of the queue. Write the function for array implementation.
 void deleteKth(int K)
 */

    public void deleteKth(int K) {
        // Calculate the index of the K'th element to delete
        int deleteIndex = (first + K) % N;

        // Shift elements to the left to fill the gap
        for (int i = deleteIndex; i != last; i = (i + 1) % N) {
            array[i] = array[(i + 1) % N];
        }

        // Update the last index
        last = (last - 1 + N) % N;
    }

}

package Queuee;

public class q11_deleteKth {

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

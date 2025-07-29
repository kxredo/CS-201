package MT3.Heap;

public class q27_descendants {

    void descendants(int current, int[] list, int[] index) {
        
        list[index[0]] = array[current].getData(); // Store the current node's data
        index[0]++; // Increment the index for the next position

        // Recursively call for each child node
        for (int i = 1; i <= d && d * current + i < count; i++) {
            descendants(d * current + i, list, index);
        }
    }

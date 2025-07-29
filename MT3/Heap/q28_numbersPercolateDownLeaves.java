package MT3.Heap;

public class q28_numbersPercolateDownLeaves {

    public int numbersPercolateDownToLeaves(int[] list, int size) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            int value = list[i];
            int index = 0;
            while (index < count) {
                int left = 2 * index + 1;
                int right = 2 * index + 2;
                if (left >= count) {
                    break; // No children to percolate down to
                }
                if (right >= count || array[left].getData() < array[right].getData()) {
                    if (value > array[left].getData()) {
                        index = left; // Percolate down to left child
                    } else {
                        break; // Value is in the correct position
                    }
                } else {
                    if (value > array[right].getData()) {
                        index = right; // Percolate down to right child
                    } else {
                        break; // Value is in the correct position
                    }
                }
            }
            if (index >= count) {
                count++; // Reached a leaf node
            }
        }
        return count;

    }
}

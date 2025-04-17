package Queuee;

public class q14_insertAfterLargest {

    /*
Write a function that inserts a new element after the largest element
 of the queue. Write the function for array implementation. You are
 not allowed to use any queue methods, just attributes, constructors,
 getters and setters.
 void insertAfterLargest (int data)
     */
    public void insertAfterLargest(int data) {
        int largestIndex = first;
        int largestValue = array[first].getData();

        // Find the largest element
        for (int i = (first + 1) % N; i != last; i = (i + 1) % N) {
            if (array[i].getData() > largestValue) {
                largestValue = array[i].getData();
                largestIndex = i;
            }
        }
        // Calculate the index after the largest element
        int insertIndex = (largestIndex + 1) % N;

        // Shift elements to make space for the new element
        for (int i = last; i != insertIndex; i = (i - 1 + N) % N) {
            array[i] = array[(i - 1 + N) % N];
        }
        // Insert the new element
        array[insertIndex] = new Element(data);

        // Update the last index
        last = (last + 1) % N;
    }
}

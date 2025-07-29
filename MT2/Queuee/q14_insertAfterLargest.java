package Queuee;

public class q14_insertAfterLargest {

    /*
Write a function that inserts a new element after the largest element
 of the queue. Write the function for array implementation. You are
 not allowed to use any queue methods, just attributes, constructors,
 getters and setters.
 void insertAfterLargest (int data)
     */
    void insertAfterLargest(int data) {

        int count = (last - first + N) % N; // Number of elements in the queue
        int largest = first; // Start with the first element as largest

        for (int i = 1; i < count; i++) {
            int current = (first + i) % N;
            if (array[current].getData() > array[largest].getData()) {
                largest = current;
            }
        }

        for (int i = last; i != largest; i = (i - 1 + N) % N) {
            array[(i + 1) % N] = array[i];
        }

        // Insert the new element after the largest element
        array[(largest + 1) % N] = new Element(data);
        last = (last + 1) % N; // Update last pointer
    }
}

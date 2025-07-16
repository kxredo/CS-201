package Queuee;

/*
Write a method
 void rotateQueue(int k)
 where k is a non-negative integer representing the number of positions
 to rotate the queue by, which is implemented using an array. After the
 rotation, the first element of the queue should move to the back k times,
 and the order of the other elements should shift accordingly. You are
 not allowed to use the enqueue(), dequeue(), or peek() methods. The
 solution should rotate the array in O(N) time, where N is the number
 of elements in the queue. Assume that k ≤ N.
 */
public class q24_rotateQueue {

    public void rotateQueue(int k) {
        // Make a copy of the elements in queue order

        int[] temp = new int[size];
        for (int i = 0; i < size; i++) {
            temp[i] = arr[(front + i) % arr.length];
        }

        // Rotate: Copy elements from temp to arr (in queue order)
        for (int i = 0; i < size; i++) {
            arr[(front + i) % arr.length] = temp[(i + k) % size];
        }
    }

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

    public void rotateQueue(int k){
        
        Element[] newArray = new Element[N];
        int count = (last - first + N) % N; // Number of elements in the queue
        for (int i = 0; i < count; i++) {
            newArray[(i + k) % N] = array[(first + i) % N];
        }
        array = newArray;
        first = 0;
        last = count;
    }

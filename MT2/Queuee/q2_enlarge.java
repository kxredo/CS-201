package Queuee;

public class q2_enlarge {
    private void enlarge() {
        int newCapacity = capacity * 2;
        int[] newQueue = new int[newCapacity];
        for (int i = 0; i < size; i++) {
            newQueue[i] = queue[(front + i) % capacity];
        }
        queue = newQueue;
        front = 0;
        rear = size - 1;
        capacity = newCapacity;
    }
    
}

package Queuee;

public class q2_enlarge {
    public void enlarge() {
        int[] newQueue = new int[queue.length * 2];
        int index = 0;
        for (int i = front; i < front + size; i++) {
            newQueue[index++] = queue[i % queue.length];
        }
        queue = newQueue;
        front = 0;
        rear = size - 1;
    }
    
}

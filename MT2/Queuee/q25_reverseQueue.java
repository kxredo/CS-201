package Queuee;

/*
/*
Write a method
 void reverseQueue()
 given a queue that is implemented as a linked list. The method should
 reverse the order of elements in the queue without using the queue’s en
queue(), dequeue(), or peek() methods. You must directly manipulate
 the underlying linked list of the queue to achieve the reversal.
 */


*/
public class q25_reverseQueue {

    void reverseQueue() {
        Node prev = null;
        Node current = front;
        Node next = null;
        rear = front;  // After reversal, front becomes rear

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        front = prev;  // New head of the reversed list
    }

    void reverseQueue(){
        Element[] newArray = new Element[N];
        int count = (last - first + N) % N; // Number of elements in the queue
        for (int i = 0; i < count; i++) {
            newArray[i] = array[(first + count - 1 - i) % N];
        }
        array = newArray;
        first = 0;
        last = count;
    }
}
}

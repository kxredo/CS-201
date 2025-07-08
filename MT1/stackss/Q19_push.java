package stackss;

public class Q19_push {

    void push(int k, int data) {

        int idx = size - k + 1; // index to insert at
        // Shift elements up to make room
        for (int i = size; i > idx; i--) {
            array[i] = array[i - 1];
        }
        array[idx] = data;
        size++;
    }

    void push(int k, int data) {
        DoubleNode newNode = new DoubleNode(data);
        DoubleNode current = head;
        int count = 1;
        
        while (current != null && count < k - 1) {
            current = current.next;
            count++;
        }
        
        newNode.next = current.next;
        if (current.next != null) {
            current.next.prev = newNode;
        }
        current.next = newNode;
        newNode.prev = current;
    }

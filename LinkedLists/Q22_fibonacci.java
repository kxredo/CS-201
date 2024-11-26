package LinkedLists;

public class Q22_fibonacci {

    /*
Write a function that returns the Fibonacci numbers between A and B
 as a linked list. Fibonacci numbers are:
 F0 =0
 F1 =1
 F2 =1
 . . .
 Fn =Fn−1 +Fn−2
 LinkedList fibonacci (int A, int B)
     */
    LinkedList fibonacci(int A, int B) {
        LinkedList result = new LinkedList();
        Node current = null;

        int f0 = 0, f1 = 1;

        // Generate Fibonacci numbers and add those within range to the linked list
        while (f0 <= B) {
            if (f0 >= A) {
                Node newNode = new Node(f0);

                if (result.head == null) {
                    result.head = newNode;
                    current = result.head;
                } else {
                    current.next = newNode;
                    current = current.next;
                }
            }

            int nextFibo = f0 + f1;
            f0 = f1;
            f1 = nextFibo;
        }

        return result;
    }

}

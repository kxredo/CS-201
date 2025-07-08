package LinkedLists;

public class q45_reverseFibo {
    public static Node reverseFibo(int N) {
        // Generate Fibonacci numbers <= N in a linked list (reversed)
        Node head = new Node(1);
        int a = 1, b = 2;
        while (b <= N) {
            Node newNode = new Node(b);
            newNode.next = head;
            head = newNode;
            int c = a + b;
            a = b;
            b = c;
        }
}

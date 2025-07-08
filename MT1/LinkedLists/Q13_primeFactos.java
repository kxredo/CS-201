package LinkedLists;

import java.util.LinkedList;

public class Q13_primeFactos {

    /*
Given an integer N, write a function which returns the prime factors of N as singly linked list.
LinkedList primeFactors(int N)
     */

    public LinkedList primeFactors(int N) {
        LinkedList result = new LinkedList();
        Node current = head;
        
        for (int i = 2; i * i <= N; i++) {
            while (N % i == 0) {
                current.next = new Node(i);
                current = current.next;
                N = N / i;
            }
        }
        if (N > 1) {
            current.next = new Node(N);
        }
        result.head = current.next;
        return result;
}
    }

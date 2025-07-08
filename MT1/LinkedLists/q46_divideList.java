package LinkedLists;

public class q46_divideList {
    
    public DoubleLinkedList[] divideList(int k) {
    DoubleLinkedList[] result = new DoubleLinkedList[k];
    
    for (int i = 0; i < k; i++) {
        result[i] = new DoubleLinkedList();
    }

    Node current = head;
    int index = 0;
    Node[] tails = new Node[k]; // To keep track of tails for each list

    while (current != null) {
        // Create a new node with the current value
        Node newNode = new Node(current.data);
        int listIndex = index % k;

        // Add the new node to the corresponding list
        if (result[listIndex].head == null) {
            result[listIndex].head = newNode;
            tails[listIndex] = newNode;
        } else {
            tails[listIndex].next = newNode;
            newNode.prev = tails[listIndex];
            tails[listIndex] = newNode;
        }

        current = current.next;
        index++;
    }

    return result;
}
}

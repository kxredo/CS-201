Write a method which returns the sorted form of the linked list (as
 a new linked list), which contains only numbers 1, 2, and 3. Your
 algorithm should run in linear time O(N).
 LinkedList sortLinkedList (LinkedList list )

public ListNode sortLinkedList(ListNode list) {
        // Step 1: Count the occurrences of 1, 2, and 3
        int count1 = 0, count2 = 0, count3 = 0;
        ListNode current = list;

        while (current != null) {
            if (current.val == 1) count1++;
            else if (current.val == 2) count2++;
            else if (current.val == 3) count3++;
            current = current.next;
        }

        // Step 2: Rebuild the linked list in sorted order
        ListNode sortedList = new ListNode(0); // Dummy head node
        ListNode tail = sortedList;

        // Add 1's
        for (int i = 0; i < count1; i++) {
            tail.next = new ListNode(1);
            tail = tail.next;
        }

        // Add 2's
        for (int i = 0; i < count2; i++) {
            tail.next = new ListNode(2);
            tail = tail.next;
        }

        // Add 3's
        for (int i = 0; i < count3; i++) {
            tail.next = new ListNode(3);
            tail = tail.next;
        }

        return sortedList.next; // Return the next node of dummy head
    }

Modify the original insertion sort so that
 void insertionSort (LinkedList l)

 it will use the same algorithm but sorts the elements in the linked list
 l. You can only use getPrevious method as an external method except
 getters and setters.

void insertionSort() {
        if (!head || !head->next) {
            return;  // Empty or one-element list is already sorted
        }

        ListNode* sorted = nullptr;  // Start with empty sorted list
        ListNode* current = head;

        while (current) {
            ListNode* nextNode = current->next;  // Save the next node

            // Insert current node into the sorted portion of the list
            if (!sorted || current->val <= sorted->val) {
                // Insert at the beginning of the sorted list
                current->next = sorted;
                if (sorted) {
                    sorted->prev = current;
                }
                current->prev = nullptr;
                sorted = current;
            } else {
                ListNode* temp = sorted;
                // Find the correct position to insert the node
                while (temp->next && temp->next->val < current->val) {
                    temp = temp->next;
                }
                // Insert the node after temp
                current->next = temp->next;
                if (temp->next) {
                    temp->next->prev = current;
                }
                temp->next = current;
                current->prev = temp;
            }

            // Move to the next node to be inserted
            current = nextNode;
        }

        head = sorted;  // Reset head to the sorted list
    }

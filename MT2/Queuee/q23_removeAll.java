package Queuee;

/*
Write the method
 void removeAll(Queue[] list )
 which removes all elements in the queues in the list from the original
 queue. You are not allowed to use enqueue, dequeue, isEmpty func
tions. You should solve the question for list implementation.
 */
public class q23_removeAll {

    void removeAll(Queue[] list) {
        
        for (Queue q : list) {
            Node tmp = q.first;
            
            while (tmp != null) {
                int value = tmp.getData();
                Node before = null;
                Node current = first;
                
                while (current != null) {
                    if (current.getData() == value) {
                        if (before != null) {
                            before.next = current.next;
                        } else {
                            first = current.next;
                        }
                        if (current == last) {
                            last = before;
                        }
                    } else {
                        before = current;
                    }
                    current = current.next;
                }
                tmp = tmp.next;
            }
        }
    }
        
    

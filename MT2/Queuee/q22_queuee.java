/*
Write another constructor method
 void Queue(Queue[] list)
 which constructs a new array based queue by adding the elements in
 the list of queues one by one. So, the first k elements of the original
 queue will be constructed with the first elements of the k queues in
 the list; the second k elements of the original queue will be constructed
 with the second elements of the k queues in the list etc. The elements
 from queues should be recreated (not copied from the queues). You are
 not allowed to use enqueue, dequeue, isEmpty functions. You should
 solve the question for array implementation.
 */


Queue(Queue[] list){
        int totalCount = 0;
        for (Queue q : list) {
            totalCount += (q.last - q.first + q.N) % q.N; // Count elements in each queue
        }
        this.N = totalCount;
        this.array = new Element[N];
        this.first = 0;
        this.last = 0;

        int index = 0;
        for (Queue q : list) {
            int count = (q.last - q.first + q.N) % q.N; // Number of elements in the current queue
            for (int i = 0; i < count; i++) {
                array[index++] = new Element(q.array[(q.first + i) % q.N]); // Recreate elements
            }
        }
        last = index;
    }

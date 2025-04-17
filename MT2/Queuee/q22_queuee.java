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
public Queue(Queue[] list) {

        int totalCapacity = 0;
        for (Queue q : list) {
            totalCapacity += (q.last - q.first) % q.N;
        }

        this.array = new Element[totalCapacity + 1];
        this.first = 0;
        this.last = 0;
        this.N = totalCapacity + 1;

        boolean hasElements = true;
        int index = 0;
        while (hasElements) {
            hasElements = false;
            for (Queue q : list) {
                if (index < (q.last - q.first) % q.N) {
                    Element element = q.array[(q.first + index) % q.N];
                    this.array[this.last] = new Element(element.getData());
                    this.last++;
                    hasElements = true;
                }
            }
            index++;
        }
    }

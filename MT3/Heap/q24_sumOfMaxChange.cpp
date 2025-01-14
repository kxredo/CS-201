Write the method in MinDHeap class
 int sumOfMaxChange(int min, int max)
 that returns the sum of the lengths of the change intervals of each
 node. A change interval of a node N is defined with the minimum
 and maximum values that can be attained by N without changing any
 other node. For root node, take the minimum as min. For leaf nodes,
 take the maximum as max.

int MinDHeap::sumOfMaxChange(int min, int max) {
    int sum = 0;

    for (int i = 0; i < count; i++) {
        int currentMin = min;
        int currentMax = max;

        // Traverse children to find the minimum value that this node can take
        for (int j = 1; j <= d && d * i + j < count; j++) {
            int child = d * i + j;
            if (array[child].getData() > currentMin) {
                currentMin = array[child].getData();
            }
        }

        // Traverse parent to find the maximum value that this node can take
        if (i > 0) {
            int parent = (i - 1) / d;
            if (array[parent].getData() < currentMax) {
                currentMax = array[parent].getData();
            }
        }

        sum += currentMax - currentMin;
    }

    return sum;
}
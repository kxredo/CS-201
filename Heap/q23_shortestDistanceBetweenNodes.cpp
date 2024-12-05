Write the method in MaxHeap class
 int shortestDistanceBetweenNodes(int index1, int index2)
 that returns the shortest distance between two nodes in the heap with
 indexes index1 and index2. Generate the ascendant lists of the nodes
 with index1 and index2 (You can assume the tree depth is smaller than
 100). Compare those lists to solve the problem.


int MaxHeap::shortestDistanceBetweenNodes(int index1, int index2) {
    if (index1 == index2) return 0;

    int ascendants1[100], ascendants2[100];
    int size1 = 0, size2 = 0;

    int temp = index1;
    while (temp > 0) {
        temp = (temp - 1) / 2;
        ascendants1[size1++] = temp;
    }
    temp = index2;
    while (temp > 0) {
        temp = (temp - 1) / 2;
        ascendants2[size2++] = temp;
    }

    int i = 0;
    while (i < size1 && i < size2 && ascendants1[i] == ascendants2[i]) {
        i++;
    }

    int distance = (size1 - i) + (size2 - i) + 2;
    return distance;
}
Write the method
 int∗ numberOfDescendants(int index)
 which returns the descendants (children, grandchildren, grandgrand
children, etc.) of set with index index. Your method should run in
 O(N) time. The size of the returning array should be as much as
 needed.

 int* DisjointSet::numberOfDescendants(int index, int& descSize) {
    int root = findSetIterative(index);
    descSize = 0;

    // First, count the number of descendants
    for (int i = 0; i < count; ++i) {
        if (findSetIterative(i) != root && findSetIterative(i) == index) {
            descSize++;
        }
    }

    // Allocate memory for the result array
    int* result = new int[descSize];
    int j = 0;

    // Collect the descendants
    for (int i = 0; i < count; ++i) {
        if (findSetIterative(i) != root && findSetIterative(i) == index) {
            result[j++] = i;
        }
    }

    return result;
}
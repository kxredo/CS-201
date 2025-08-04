/*Write a function that returns the index of the maximum valued grand
child (children of children) of a heap node given its index.
 int maxGrandChild(int no)
*/
int maxGrandChild(int no) {
    int maxIndex = 4 * no + 3; // Initialize to the first grandchild index
    int maxValue = array[maxIndex].getData();

    // Iterate over the remaining potential grandchildren
    /*
    The reason for i < 4 in the loop is to iterate over the potential indices of the four grandchildren of a heap node. In a binary heap, each node can have up to two children, and each child can have up to two children, resulting in up to four grandchildren.*/
    for (int i = 1; i < 4; ++i) {
        int grandChildIndex = 4 * no + 3 + i; // Indices of the grandchildren

        if (array[grandChildIndex].getData() > maxValue) {
            maxValue = array[grandChildIndex].getData();
            maxIndex = grandChildIndex;
        }
    }

    return maxIndex;
}


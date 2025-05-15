/*Given the index of a heap node, write a function that returns the maximum child of this node.
 HeapNode largestChild(int index)
*/
HeapNode largestChild(int index) {
    int leftChild = 2 * index + 1;
    int rightChild = 2 * index + 2;

    if (rightChild >= count || array[leftChild].getData() > array[rightChild].getData()) {
        return array[leftChild];
    } else {
        return array[rightChild];
    }
}
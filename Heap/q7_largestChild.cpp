Given the index of a heap node, write a function that returns the maximum child of this node.
 HeapNode largestChild(int index)

HeapNode largestChild(int index) {
    int leftChild = 2 * index + 1;
    int rightChild = 2 * index + 2;

    if (leftChild >= count) {
        throw std::out_of_range("Index has no children");
    }
// if rightChild doesnt exist (its index is more than heap size) or if leftChild value > rightChild value
// return leftChild
// else return rightChild
    if (rightChild >= count || array[leftChild].getData() > array[rightChild].getData()) {
        return array[leftChild];
    } else {
        return array[rightChild];
    }
}
/*Given the index of a heap node in a max-heap, write a function that
returns the minimum descendant of this node.
HeapNode minDescendant(int index)
*/

public HeapNode minDescendant(int index) {
    int leftChild = 2 * index + 1;
    int rightChild = 2 * index + 2;
    HeapNode minNode = array[index];

    
    if(leftChild < count){
        HeapNode leftMin = minDescendant(leftChild);
        if (leftMin.getData() < minNode.getData()) {
            minNode = leftMin;
        }
    }
    if (rightChild < count) {
        HeapNode rightMin = minDescendant(rightChild);
        if (rightMin.getData() < minNode.getData()) {
            minNode = rightMin;
        }
    }
    return minNode;
}
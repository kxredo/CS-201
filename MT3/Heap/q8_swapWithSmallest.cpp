/*Given the index of a heap node, write a function that swaps this node with its smallest child.
void swapWithSmallest(int index)
*/
void Heap::swapWithSmallest(int index) {
    int leftChild = 2 * index + 1;
    int rightChild = 2 * index + 2;
    int smallestChild = index; //smallest is parent
    

    if (leftChild < count) 
    {
        if(array[leftChild].getData() < array[smallestChild].getData(){
        smallestChild = leftChild;
    }
}

    if (rightChild < count) 
    {
        if(array[rightChild].getData() < array[smallestChild].getData(){
        smallestChild = rightChild;
    }
}
// if smallest value is NOT parent
// swap parent with smallestChild
    if (smallestChild != index) {
        swapNode(index, smallestChild);
    }
}


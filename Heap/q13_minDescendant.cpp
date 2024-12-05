



HeapNode Heap::minDescendant(int index) {
    if (index >= count) {
        throw std::out_of_range("Index out of range");
    }

    HeapNode minNode = array[index];
    std::queue<int> q;
    q.push(index);

    while (!q.empty()) {
        int currentIndex = q.front();
        q.pop();

        int leftChild = 2 * currentIndex + 1;
        int rightChild = 2 * currentIndex + 2;

        if (leftChild < count) {
            if (array[leftChild].getData() < minNode.getData()) {
                minNode = array[leftChild];
            }
            q.push(leftChild);
        }

        if (rightChild < count) {
            if (array[rightChild].getData() < minNode.getData()) {
                minNode = array[rightChild];
            }
            q.push(rightChild);
        }
    }
    return minNode;
}
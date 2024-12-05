/*
Given the index of a heap node, write a function that obtains the height
 of this node. The height of a node is the length of the longest path
 from that node to a leaf.
 int height(int index)*/

int height(int index) {
    int leftChild = 2 * index + 1;
    int rightChild = 2 * index + 2;
    
    if (leftChild >= count && rightChild >= count) {
        // If the node has no children, its height is 0.
        return 0;
    }

    int leftHeight = 0;
    int rightHeight = 0;

    if (leftChild < count) {
        leftHeight = height(leftChild);
    }

    if (rightChild < count) {
        rightHeight = height(rightChild);
    }

    // The height of the node is 1 + the maximum height of its children.
    return 1 + std::max(leftHeight, rightHeight);
}
/*
Given the index of a heap node, write a function that obtains the height
 of this node. The height of a node is the length of the longest path
 from that node to a leaf.
 int height(int index)*/

int height(int index)
{

    int leftChild = 2 * index + 1;
    int rightChild = 2 * index + 2;

    int leftHeight = 0;
    int rightHeight = 0;
    int maxHeight;

    if (leftChild < count){
        leftHeight = height(leftChild);
    }

    if (rightChild < count){
        rightHeight = height(rightChild);
    }

    if (leftHeight > rightHeight){
        maxHeight = leftHeight;
    }
    else {
        maxHeight = rightHeight;
    }
    return 1 + maxHeight;
    }
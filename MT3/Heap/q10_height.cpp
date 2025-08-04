/*
Given the index of a heap node, write a function that obtains the height
 of this node. The height of a node is the length of the longest path
 from that node to a leaf.
 int height(int index)*/

int height(int index)
{

    int height = 0;
    int left = 2 * index + 1;
    int right = 2 * index + 2;
    if (left < count)
    {
        height = Math.max(height, height(left));
    }
    if (right < count)
    {
        height = Math.max(height, height(right));
    }
    return height + 1; // Include the current node
}
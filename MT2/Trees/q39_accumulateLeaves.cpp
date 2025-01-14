
void accumulateLeaves(int *a, int &index)
{
    // If this is a leaf node (no left and no right child), add its value to the array
    if (left == nullptr && right == nullptr)
    {
        a[index] = val;
        index++; // Increment the index to store the next leaf value
    }

    // Recursively accumulate leaf nodes from the left child if it exists
    if (left != nullptr)
    {
        left->accumulateLeaves(a, index);
    }

    // Recursively accumulate leaf nodes from the right child if it exists
    if (right != nullptr)
    {
        right->accumulateLeaves(a, index);
    }
}
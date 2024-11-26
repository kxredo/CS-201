
void TreeNode::accumulate(int *a, int &index)
{
    if (left != nullptr)
    {
        left->accumulateData(a, index);
    }
    a[index] = data;
    index++;

    if (right != nullptr)
    {
        right->accumulateData(a, index);
    }
}
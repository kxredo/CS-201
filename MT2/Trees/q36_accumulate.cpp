/*
Write a recursive method in TreeNode class
 void accumulate(int∗ a, int& index)
 that accumulates all contents (integers as data field) in the tree in
 array a, where the values in the array are will be sorted. Use and
 modify index to store the integers into correct positions. Your method
 should run in O(N) time.
*/
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
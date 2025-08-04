

HeapNode kthMaximum(int k)
{

    MaxHeap tempHeap = new MaxHeap(count);
    for (int i = 0; i < count; i++)
    {
        tempHeap.insert(array[i]);
    }
    HeapNode result = null;
    for (int i = 0; i < k; i++)
    {
        result = tempHeap.delete();
    }
    return result;
}
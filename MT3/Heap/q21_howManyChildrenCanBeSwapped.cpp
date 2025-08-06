/*
Write the method in MinHeap class
 int howManyChildrenCanBeSwapped()
 that returns the number of nodes in the heap whose children can be
 swapped without hurting the heap property. Your method should run
 in O(N) time.
*/

int MinHeap::howManyChildrenCanBeSwapped()
{
    int countSwappable = 0;
    for (int i = 0; i < count; ++i)
    {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < count && right < count)
        {
            int parent = array[i].getData();
            int leftChild = array[left].getData();
            int rightChild = array[right].getData();
            if (leftChild >= parent && rightChild >= parent)
            {
                countSwappable++;
            }
        }
    }
    return countSwappable;
}

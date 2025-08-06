
int MinHeap::numbersPercolateUpToRoot(int* list, int size)
{
    int count = 0;
    for (int i = 0; i < size; i++){
        int no = list[i];
        int parent = (no - 1) / 2;
        while (parent >= 0 && array[parent].getData() > array[no].getData()){
            count++;
            no = parent;
            parent = (no - 1) / 2;
        }
    }
    return count;
}
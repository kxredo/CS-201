
bool heapOrder(int[] A, int N)
{
    for (int i = 0; i < N; i++)
    {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < N && A[i] < A[left])
        {
            return false;
        }
        if (right < N && A[i] < A[right])
        {
            return false;
        }
    }
    return true;
}
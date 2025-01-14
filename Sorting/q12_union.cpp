Suppose arrays A and B are both sorted.Write a function that works
    in linear time and finds A union B.int[] union(int[] A, int[] B)

        int[] union(int[] A, int[] B)
{
    int[] result = new int[A.size() + B.size()];
    int i = 0, j = 0, k = 0;
    while (i < A.size() && j < B.size())
    {
        if (A[i] < B[j])
        {
            result[k++] = A[i++];
        }
        else if (A[i] > B[j])
        {
            result[k++] = B[j++];
        }
        else
        {
            result[k++] = A[i++];
            j++;
        }
    }
    return result;
}

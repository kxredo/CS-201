Suppose you are given an array of N integers.Write a single pass
    algorithm in QuickSort class that puts the odd integers before the even
        integers similar to the partition algorithm in QuickSort.void
        oddsBeforeEvens(int∗
                            A,
                        int N)

void oddsBeforeEvens(int *A, int N)
{
    int i = 0;
    int j = N - 1;
    while (i < j)
    {
        while (i < N && A[i] % 2 != 0)
            i++;
        while (j >= 0 && A[j] % 2 == 0)
            j--;
        if (i < j)
        {
            int tmp = A[i];
            A[i] = A[j];
            A[j] = tmp;
        }
    }
}

int algorithm1(int N)
{
    if (N == 0)
        return 0;
    int sum = 0;
    for (int i = 0; i < N; i++)
        for (int j = 0; j < N; j++)
            sum++;
    for (int i = 0; i < 2; i++)
        for (int j = 0; j < 2; j++)
            for (int k = 0; k < 2; k++)
                if ((i + j + k) % 3 == 1)
                    sum += algorithm1(N / 2) + algorithm1(N / 2);
                else if ((i + j + k) % 3 == 0)
                    sum += algorithm1(N / 2);
                else
                    sum++;
    return sum;
}

int algorithm2(int N)
{
    int i, j, k, sum = 0;
    for (i = 1; i <= N - i; i++)
        sum++;
    for (i = 0; i < N; i++)
        for (j = 1; j <= 2 * i; j++)
            for (k = 1; k <= j - i; k++)
                sum++;
    for (i = 1; i <= N; i++)
        for (j = i + 1; j <= N; j++)
            sum++;
    return sum;
}

int algorithm1(intN)
{
    if (N == 0)
        return0;
    int sum = 0;
    for (int i = 0; i < N; i++)
        for (int j = 0; j < N; j++)
            for (int k = 0; k < N; k++)
                sum++;
    for (int i = 0; i < 2; i++)
        for (int j = 0; j < 2; j++)

            sum += algorithm1(N / 2) + algorithm1(N / 2);
    return sum;
}

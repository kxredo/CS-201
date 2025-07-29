Write the method in MaxDHeap class
    int
    third()
        that returns the third maximum number in the heap.Your method
    should run in O(d2) time.

    public int third()
{
    
    int max = array[0].getData();
    int secondMax = Integer.MIN_VALUE;
    int thirdMax = Integer.MIN_VALUE;

    for (int i = 1; i < count; i++)
    {
        int currentValue = array[i].getData();
        if (currentValue > max)
        {
            thirdMax = secondMax;
            secondMax = max;
            max = currentValue;
        }
        else if (currentValue > secondMax && currentValue < max)
        {
            thirdMax = secondMax;
            secondMax = currentValue;
        }
        else if (currentValue > thirdMax && currentValue < secondMax)
        {
            thirdMax = currentValue;
        }
    }
    return thirdMax;
}

Write the method in MinDHeap class
    int
    sumOfMaxChange(int min, int max)
        that returns the sum of the lengths of the change intervals of each
    node.A change interval of a node N is defined with the minimum
        and maximum values that can be attained by N without changing any
    other node.For root node,
    take the minimum as min.For leaf nodes,
    take the maximum as max.

    int sumOfMaxChange(int min, int max)
{
    int sum = 0;
    for (int i = 0; i < count; i++)
    {
        int nodeValue = array[i].getData();
        if (i == 0)
        { // root node
            sum += Math.abs(nodeValue - min);
        }
        else if (2 * i + 1 >= count)
        { // leaf node
            sum += Math.abs(nodeValue - max);
        }
        else
        { // internal node
            sum += Math.abs(nodeValue - min) + Math.abs(nodeValue - max);
        }
    }
    return sum;
}
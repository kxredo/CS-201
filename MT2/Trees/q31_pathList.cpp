
int *Tree ::pathList()
{
    TreeNode* tmp = root;
    int count = 0;

    while (tmp != nullptr)
    {
        if (tmp->getData() % 2 == 0)
        {
            tmp = tmp->getLeft();
        }
        else
        {
            tmp = tmp->getRight();
        }
        count++;
    }
    int *result = new int[count];

    count = 0;
    while (tmp != nullptr)
    {
        result[count] = tmp->getData();
        if (tmp->getData() % 2 == 0)
        {
            tmp = tmp->getLeft();
        }
        else
        {
            tmp = tmp->getRight();
        }
        count++;
    }
    return result;
}
Write a function that returns the index of a heap node’s grandparent(parent of parent) given its index.int grandParent(int no)

int grandParent(int no){
    int parent = (no - 1) / 2;
    int grandParent = (parent - 1) / 2;

    if (no == 0) // if index = 0 is root
    {
        return -1;
    }
    if (parent == 0) // if index = 0 is parent (meaning no grandParent)
    {
        return -1;
    }
    return grandParent;
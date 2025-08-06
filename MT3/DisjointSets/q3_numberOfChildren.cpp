Given the index of a set, write a function that determines the number
 of children of that set.
 int numberOfChildren(int index)

int DisjointSet::numberOfChildren(int index) {
    int childrenCount = 0;
    int parentIndex = findSetIterative(index); //finds root or parent of index
    for (int i = 0; i < count; ++i) {
        if (i != index && findSetIterative(i) == parentIndex) {
            ++count;
        }
    }
    return count;
}
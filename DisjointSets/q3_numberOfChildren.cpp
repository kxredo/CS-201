Given the index of a set, write a function that determines the number
 of children of that set.
 int numberOfChildren(int index)

 The findSetIterative function in the DisjointSet class finds the root (representative) of the set containing the given element index using an iterative approach. Here's what it does:

Initialization: It starts by getting the parent of the element at index.
Iteration: It repeatedly updates index to its parent until it finds the root (an element that is its own parent).
Return: It returns the root of the set containing the initial index.

int DisjointSet::numberOfChildren(int index) {
    int count = 0;
    int parentIndex = findSetIterative(index);
    for (int i = 0; i < this->count; ++i) {
        if (i != index && findSetIterative(i) == parentIndex) {
            ++count;
        }
    }
    return count;
}
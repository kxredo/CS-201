Given the index of a set, write a function that computes the sum of all
 ancestors (parent, grandparent, etc.).
 int sumOfAncestors(int index)

 int DisjointSet::sumOfAncestors(int index) {
    int sum = 0;
    int parent = sets[index].getParent();
    while (parent != index) {
        sum += parent;
        index = parent;
        parent = sets[index].getParent();
    }
    return sum;
}


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
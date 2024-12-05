


int descendants(int no, int d, int* heap, int count) {
    int numDescendants = 0;

    for (int i = 1; i <= d; i++) {
        int childIndex = d * no + i;
        if (childIndex < count) {
            numDescendants += 1 + descendants(childIndex, d, heap, count);
        }
    }

    return numDescendants;
}
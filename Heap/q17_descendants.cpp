

int descendants(int no, int level, int d, int* heap, int count) {
    if (level <= 0) return 0;

    int numDescendants = 0;
    int startIndex = d * no + 1;
    int endIndex = d * no + d;

    if (level == 1) {
        for (int i = startIndex; i <= endIndex && i < count; ++i) {
            numDescendants++;
        }
    } else {
        for (int i = startIndex; i <= endIndex && i < count; ++i) {
            numDescendants += descendants(i, level - 1, d, heap, count);
        }
    }

    return numDescendants;
}
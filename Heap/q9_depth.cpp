

int depth(int index) {
    int depth = 0;
    while (index > 0) {
        index = (index - 1) / 2;
        depth++;
    }
    return depth;
}
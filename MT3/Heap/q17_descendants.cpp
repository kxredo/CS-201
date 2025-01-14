Given index of a d-heap node and a level l, write a recursive function
that returns the number of descendants at level l of that heap node.
Level 1 corresponds to children, Level 2 corresponds grandchildren,
Level 3 corresponds grand grand children of that heap node.
int descendants(int no, int level )

int Heap::descendants(int no, int level) {
    if (level < 1) return 0;

    int countDescendants = 0;
    int firstChild = no * d + 1;
    int lastChildIndex = no * d + d;

    if (level == 1) {
        for (int i = firstChild; i <= lastChild && i < count; ++i) {
            countDescendants++;
        }
    } else {
        for (int i = firstChild; i <= lastChild && i < count; ++i) {
            countDescendants += descendants(i, level - 1);
        }
    }

    return countDescendants;
}
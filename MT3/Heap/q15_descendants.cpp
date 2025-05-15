/*Given the index of a d-heap node, write a method that returns the
number of descendants (children, grandchildren, grandgrandchildren, etc.) 
of that heap node. 
Do not use any class or external methods.
int descendants(int no)
*/
int Heap::descendants(int no) {
    int countDescendants = 0;

    for (int i = no + 1; i < count; ++i) {
        // Check if node i is a descendant of node no
        int current = i;
        while (current > no) {
            current = (current - 1) / d; // Move to the parent node
            if (current == no) {
                countDescendants++;
                break;
            }
        }
    }

    return countDescendants;
}





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


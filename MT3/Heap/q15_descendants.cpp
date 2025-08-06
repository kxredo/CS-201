/*Given the index of a d-heap node, write a method that returns the
number of descendants (children, grandchildren, grandgrandchildren, etc.) 
of that heap node. 
Do not use any class or external methods.
int descendants(int no)
*/

int descendants(int no) {
    int desCount = 0;
    for (int i = d * no + 1; i <= d * no + d && i < count; i++) {
        desCount++; // count the child itself
        desCount += descendants(i); // recursively count descendants
    }
    return desCount;
}


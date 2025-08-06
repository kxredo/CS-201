/*
Given the index of a set, write a function that returns the descendants
(itself, children, grandchildren, etc.).
int* descendants(int index)
The size of the returning array should be as much as needed.
*/

int* DisjointSet::descendants(int index) {
    int* descendantList = new int[count];
    int size = 0;
    
    int* queue = new int[count];
    int front = 0, rear = 0;
    
    // Start with the given index
    queue[rear++] = index;
    
    while (front < rear) {
        int current = queue[front++];
        descendantList[size++] = current;
        
        // Find all direct children of current node
        for (int i = 0; i < count; ++i) {
            if (sets[i].getParent() == current && i != current) {
                queue[rear++] = i;
            }
        }
    }
    int* result = new int[size];
    for (int i = 0; i < size; ++i) {
        result[i] = descendantList[i];
    }
    return result;
}
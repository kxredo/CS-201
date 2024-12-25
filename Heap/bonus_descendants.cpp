// RETURNS INDEXES OF DESCENDANTS BONUS QUESTION
int* MinDHeap::descendants(int index, int& countDescendants) {


    int maxDescendants = count - index - 1; // Maximum possible descendants
    int* tempArray = new int[maxDescendants];
    countDescendants = 0;

    int* queue = new int[count];
    int front = 0, rear = 0;

    queue[rear++] = index;

    while (front < rear) {
        int current = queue[front++];
        for (int i = 1; i <= d; i++) {
            int child = d * current + i;
            if (child < count) {
                tempArray[countDescendants++] = child; // Add to descendants
                queue[rear++] = child;                // Add to queue
            }
        }
    }
    int* descendants = new int[countDescendants];
    for (int i = 0; i < countDescendants; i++) {
        descendants[i] = tempArray[i];
    }
    return descendants;
}
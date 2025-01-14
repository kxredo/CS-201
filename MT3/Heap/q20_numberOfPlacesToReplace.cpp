Write the method in MinDHeap class
 int numberOfPlacesToReplace(int key)
 that finds the number of places in the heap, which can be replaced with
 the given value key.

int MinDHeap::numberOfPlacesToReplace(int key) {
    int count = 0;
    for (int i = 0; i < count; ++i) {
        bool canBeReplaced = true;
        int parent = (i-1) / d;
        if(i > 0 && array[parent].getData() > key){
            canBeReplaced = false;
        }

        for(int j = 1; j<=d && d*i+j < count;j++) {
            int child = d*i*j;
            if(key>array[child].getData()) {
                canBeReplaced = false;
                break;
            }
        }
        if(canBeReplaced) {
            count++;
        }
    }
    return count;
}
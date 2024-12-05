

int MinDHeap::numberOfPlacesToReplace(int key) {
    int count = 0;
    for (int i = 0; i < this->count; ++i) {
        if (array[i].getData() > key) {
            count++;
        }
    }
    return count;
}
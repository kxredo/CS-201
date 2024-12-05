Write the method in MaxDHeap class
int third ()
that returns the third maximum number in the heap. Your method
should run in O(d2) time.



int MaxDHeap::third() {
    if (this->count < 3) {
        throw std::runtime_error("Heap does not contain enough elements.");
    }

    int firstMax = array[0].getData(); // Max element
    int secondMax = INT_MIN, thirdMax = INT_MIN;

    // Traverse all children of the root to find the top 3 max elements
    for (int i = 1; i <= d && i < this->count; ++i) {
        int childData = array[i].getData();
        if (childData > secondMax) {
            thirdMax = secondMax;
            secondMax = childData;
        } else if (childData > thirdMax) {
            thirdMax = childData;
        }
    }

    // Traverse all grandchildren of the root to find the third max element
    for (int i = 1; i <= d && i < this->count; ++i) {
        for (int j = 1; j <= d && d * i + j < this->count; ++j) {
            int grandChildData = array[d * i + j].getData();
            if (grandChildData > thirdMax) {
                if (grandChildData > secondMax) {
                    thirdMax = secondMax;
                    secondMax = grandChildData;
                } else {
                    thirdMax = grandChildData;
                }
            }
        }
    }

    return thirdMax;
}
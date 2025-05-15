/*
Write the method in MaxDHeap class
 int howManyPairCanBeSwapped()
 that returns the number of node pairs in the heap which can be swapped
 without hurting the heap property. Your method should run in O(N2)
 time. You may not use any additional data structures.
*/

int MaxDHeap::howManyPairCanBeSwapped() {
    int count2 = 0;
    for (int i = 1; i < count; ++i) {
        for (int j = i + 1; j < count; ++j) {
            bool flag1 = true;
            for(int k = 1; k <= d; ++k) {
                if(d*i + k < count && array[d*i + k].getData() > array[j].getData()) {
                    flag1 = false;
                    break;
                };
            }
            if(array[j].getData() > array[(i-1)/d].getData())
                flag1 = false;

            bool flag2 = true;
            for(int k = 1; k <= d; ++k) {
                if(d*j + k < count && array[d*j + k].getData() > array[i].getData()) {
                    flag2 = false;
                    break;
                };
            };
            if(array[i].getData() > array[(j-1)/d].getData())
                flag2 = false;

            if(flag1 && flag2)
                count2++;
        }
    }

    return count2;
}
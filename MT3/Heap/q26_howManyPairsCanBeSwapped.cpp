/*
Write the method in MaxDHeap class
 int howManyPairCanBeSwapped()
 that returns the number of node pairs in the heap which can be swapped
 without hurting the heap property. Your method should run in O(N2)
 time. You may not use any additional data structures.
*/

int howManyPairCanBeSwapped(){
        int count = 0;
        for (int i = 0; i < count; i++){
            for (int j = i + 1; j < count; j++){
                if (array[i].getData() < array[j].getData()){
                    count++;
                }
            }
        }
        return count;
    }
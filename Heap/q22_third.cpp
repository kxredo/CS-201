Write the method in MaxDHeap class
int third ()
that returns the third maximum number in the heap. Your method
should run in O(d2) time.



int MaxDHeap::third() {
    
    int second = 0;
    int third = 0;

    for(int i = 0; i <= d; i++){
        int child = i;
        if(child < count){
            if(array[child].getData() > second){
                third = second;
                second = array[child].getData();
            } else {
                if(array[child].getData() > third){
                    third = array[child].getData();
                }
            }
        }
    }

    // Traverse all grandchildren of the root to find the third max element
    for(int i = 0; i <= d; i++){
        for(int j = 0; j <= d; j++){
            int grandChild = d*i + j;
            if(grandChild < count){
                if(array[grandChild].getData() > second){
                    third = second;
                    second = array[grandChild].getData();
                } else {
                    if(array[grandChild].getData() > third){
                        third = array[grandChild].getData();
                    }
                }
            }
        }
    }
    return third;
}

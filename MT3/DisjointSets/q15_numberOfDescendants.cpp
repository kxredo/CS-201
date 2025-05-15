Write the method
 int∗ numberOfDescendants(int index)
 which returns the descendants (children, grandchildren, grandgrand
children, etc.) of set with index index. Your method should run in
 O(N) time. The size of the returning array should be as much as
 needed.

int* DisJointSet::numberOfDescendants(int index) {
    int count = 0;
    for(int i = 0; i < count; i++) {
        int candidate = i;
        while(candidate!=index && sets[candidate].getParent()!= candidate){
            candidate = sets[candidate].getParent();
        }
        if(candidate==index) {
            descendantCount++;
        }
    }
    int* result = new int[count];

    int childIndex = 0;
    for(int i = 0; i < count; i++){
        int candidate = i;
        while(candidate!=index && sets[candidate].getParent()!=candidate) {
            candidate = sets[candidate].getParent();
        }
        if(candidate == index){
            result[childIndex] = i;
            childIndex++;
        }
    }
    return result;
}


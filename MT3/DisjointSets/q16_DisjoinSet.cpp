Rewrite constructor in DisjointSet class
 DisjointSet (int count)
 such that all numbers with a common factor other than 1 will be in the
 same set. The numbers are from 0 to count- 1

DisjointSet::DisjointSet(int count) {
    sets = new Set[count];
    for (int i = 0; i < count; i++){
        sets[i] = Set(i, i);
    }
    this->count = count;

    for (int i = 2; i < count; i++) {
        for (int j = i + 1; j < count; j++) {
            if(j%i==0){
            unionOfSets(i, j);
            }
        }
    }
}
/*
Write the method
 int* numberOfAscendants(int index)
 which returns the ascendants (parent, grandparent, great-grandparent, etc.) 
 of set with index index. Your method should run in O(log N) time. 
 The size of the returning array should be as much as needed.
*/

int* DisjointSet::numberOfAscendants(int index) {
    int count = 0;
    
    // First pass: count how many ascendants there are
    int current = index;
    while (sets[current].getParent() != current) {
        current = sets[current].getParent();
        count++;
    }
    
    // Create array of appropriate size
    int* result = new int[count];
    
    // Second pass: fill the array with ascendants
    current = index;
    int ascendantIndex = 0;
    while (sets[current].getParent() != current) {
        current = sets[current].getParent();
        result[ascendantIndex] = current;
        ascendantIndex++;
    }
    
    return result;
}

/**
 * Returns the number of ascendants (parent, grandparent, etc.) of a set with the given index.
 * 
 * @param index The index of the set whose ascendants we want to count
 * @return The number of ascendants
 */
public int numberOfAscendants(int index) {
    int ascendantCount = 0;
    int current = index;
    
    while (current != sets[current].getParent()) {
        current = sets[current].getParent();
        ascendantCount++;
    }
    
    return ascendantCount;
}
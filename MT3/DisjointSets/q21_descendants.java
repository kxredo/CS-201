package MT3.DisjointSets;

public class q21_descendants {

    /*
    Given in the index of a set as current, write a recursive
 method
 void descendants(int current, int∗ 
list , int& index)
 that fills the descendants of that set to the array list. Use and modify
 index to store the indexes of the sets into correct positions.
     */
    public void descendants(int current, int[] list, int[] index) {
        if (current >= count) {
            return; // Base case: if current index is out of bounds
        }
        list[index[0]] = sets[current].getIndex(); // Store the current set's index
        index[0]++; // Increment the index for the next position

        // Recursively call for each child set
        for (int i = 0; i < count; i++) {
            if (sets[i].getParent() == current) {
                descendants(i, list, index);
            }
        }
    }
}

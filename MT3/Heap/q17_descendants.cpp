/*Given index of a d-heap node and a level l, write a recursive function
that returns the number of descendants at level l of that heap node.
Level 1 corresponds to children, Level 2 corresponds grandchildren,
Level 3 corresponds grand grand children of that heap node.
int descendants(int no, int level )
*/

public int descendants(int no, int level) {
    int left = 2 * no + 1;
    int right = 2 * no + 2;
    int count = 0;
    
    if (level == 1) {
        if (left < count) count++;
        if (right < count) count++;
        
        return count;
    }
    
    if (left < count){
        count += descendants(left, level - 1);
    }
    if (right < count){
        count += descendants(right, level - 1);
    }
    return count;
}

package Trees;

public class q32_averages {

    /*
Write the recursive method
 int averages()
 in TreeNode class which returns the number of nodes in the tree that
 satisfy the following property: The node’s key is the average of its
 children (left and right children).
     */
    
    
    
    
    
    
     int averages() {
        int count = 0;
        if (left != null && right != null) {
            if (data == (left.data + right.data) / 2) { // (left + right / 2) = node's key
                count++;
            }
        }
        if (left != null) {
            count += left.averages();
        }
        if (right != null) {
            count += right.averages();
        }
        return count;
    }
}

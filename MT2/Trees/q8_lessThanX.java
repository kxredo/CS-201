package Trees;

public class q8_lessThanX {

    /*
     Given an integer X, write a function that computes the number of
 nodes whose key is less than X.
 int lessThanX()
     */

    int lessThanX(int X) {
        
        int count = 0;
        
        if (key < X) {
            count++;
        }
        if (left != null) {
            count += left.lessThanX(X);
        }
        if (right != null) {
            count += right.lessThanX(X);
        }
        return count;
    }

}

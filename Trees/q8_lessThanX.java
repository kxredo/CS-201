package Trees;

public class q8_lessThanX {
    /*
     Given an integer X, write a function that computes the number of
 nodes whose key is less than X.
 int lessThanX()
     */

    public int lessThanX(int X) {
        if (this == null) {
            return 0;
        }

        if (data < X) {
            return 1 + left.lessThanX(X) + right.lessThanX(X);
        } else {
            return left.lessThanX(X);
        }
    }
}

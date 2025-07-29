package Trees;

public class q26_higherThanX {

    int higherThanX(int X) {
        int count = 0;
        if (data > X) {
            count++;
        }
        if (left != null && data > X) {
            count += left.higherThanX(X);
        }
        if (right != null && data > X) {
            count += right.higherThanX(X);
        }
        return count;
    }

}

package Trees;

public class q24_leftist {

    int leftist() {
        int count = 0;
        if (left != null && (right == null || left.data > right.data)) {
            count++;
        }
        if (left != null) {
            count += left.leftist();
        }
        if (right != null) {
            count += right.leftist();
        }
        return count;
    }

}

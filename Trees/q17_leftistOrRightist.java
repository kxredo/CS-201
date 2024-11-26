package Trees;
// SOLVED IN LAB
public class q17_leftistOrRightist {

    int leftistOrRightist2() {
        int count = 0;
        if (left != null && right == null) {
            count = 1; // leftist node
        }
        if (right != null && left == null) {
            count = -1; // rightist node
        }

        int leftCount = 0, rightCount = 0;
        if (left != null) {
            leftCount = left.leftistOrRightist2();
        }
        if (right != null) {
            rightCount = right.leftistOrRightist2();
        }

        return count + leftCount + rightCount;
    }

    int leftistOrRightist() {
        if (root != null) {
            return root.leftistOrRightist2();
        } else {
            return 0;
        }
    }

}

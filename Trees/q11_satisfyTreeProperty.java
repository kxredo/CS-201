package Trees;

public class q11_satisfyTreeProperty {

    boolean satisfyTreeProperty2(int min, int max) {
        if (left == null && right == null) {
            return val > min && val < max;
        }
        if (left != null && (left.val >= val || !left.satisfyTreeProperty2(min, val))) {
            return false;
        }
        if (right != null && (right.val <= val || !right.satisfyTreeProperty2(val, max))) {
            return false;
        }
        return val > min && val < max;
    }

    boolean satisfyTreeProperty() {
        if (root != null) {
            return root.satisfyTreeProperty2(Integer.MIN_VALUE, Integer.MAX_VALUE);
        } else {
            return true;
        }
    }

}

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
// -----------------------------------------------------------------------------------------------------------------------
    boolean satisfyTreeProperty() {
        return checkProperty(Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    boolean checkProperty(int min, int max) {
        if (this == null) return true;
        if (key <= min || key >= max) return false;
        boolean leftValid = left == null || left.checkProperty(min, key);
        boolean rightValid = right == null || right.checkProperty(key, max);
        return leftValid && rightValid;
    }
    

}

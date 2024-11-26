package Trees;

public class q25_productOfTree {

    int productOfTree() {
        int product = val;  // Start with the value of the current node

        // Recursively multiply the product with the values of the left and right subtrees
        if (left != null) {
            product *= left.productOfTree();
        }
        if (right != null) {
            product *= right.productOfTree();
        }

        return product;
    }
}

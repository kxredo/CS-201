package Trees;

/*
Write the non-recursive method
 int product()
 in Tree class that computes the products of all keys in a binary search
 tree by using stack.
 */
public class q40_product {

    public int product() {

        Stack stack = new Stack(100);
        TreeNode current = root;
        
        int product = 1;
        stack.push(new Element(current));

        while (!stack.isEmpty()) {
            current = stack.pop().getData();
            product *= current.data;
            
            if (current.left != null) {
                stack.push(new Element(current.left));
            }
            if (current.right != null) {
                stack.push(new Element(current.right));
            }
        }

        return product;
    }
}

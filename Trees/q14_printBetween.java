package Trees;

public class q14_printBetween {
    /*
     Write a function that prints all nodes in the binary search tree whose
 key is between k1 and k2.
 void printBetween(int k1, int k2)
     */
    void printBetween(int k1, int k2) {
        if (root != null) {
            if (root.key > k1) {
                root.left.printBetween(k1, k2);
            }
            if (root.key >= k1 && root.key <= k2) {
                System.out.println(root.key);
            }
            if (root.key < k2) {
                root.right.printBetween(k1, k2);
            }
        }
    }
    
}

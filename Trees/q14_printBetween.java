package Trees;

public class q14_printBetween {

    /*
     Write a function that prints all nodes in the binary search tree whose
 key is between k1 and k2.
 void printBetween(int k1, int k2)
     */
    void printBetween(int k1, int k2) {
        if (this == null) {
            return;
        }
        if (key > k1) {
            if (left != null) {
                left.printBetween(k1, k2);
            }
        }
        if (key >= k1 && key <= k2) {
            System.out.println(key);
        }
        if (key < k2) {
            if (right != null) {
                right.printBetween(k1, k2);
            }
        }
    }

}

package Trees;

public class q4_printSorted {

    void printSorted2() {
        if (left != null) {
            left.printSorted2(); // Visit the left subtree
        }

        System.out.print(data + " "); // Print the current node

        if (right != null) {
            right.printSorted2(); // Visit the right subtree
        }
    }

    void printSorted() {
        if (root != null) {
            root.printSorted2();
        }
    }
}

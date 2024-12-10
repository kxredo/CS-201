package Trees;

import java.util.Random;

public class q35_simulateSearch {
// WILL NOT BE IN EXAM
/*
Write a non-recursive method
 double simulateSearch(int N)
 in Tree class, which first finds the minimum (A) and maximum (B)
 elements in the tree. The method will then randomly search a number
 between [A, B] N times and returns the average number of nodes visited
 in this search. You are not allowed to use any tree methods.
     */

    double simulateSearch(int N) {
        TreeNode tmp = root;

        while (tmp.left != null) {
            tmp = tmp.left;
        }
        int A = tmp.data;
        tmp = root;

        while (tmp.right != null) {
            tmp = tmp.right;
        }

        int B = tmp.data;
        int count = 0;

        for (int i = 0; i < N; i++) {
            int key = new Random().nextInt(B - A + 1) + A;
            tmp = root;
            
            while (tmp != null) {
                count++;
                if (key < tmp.data) {
                    tmp = tmp.getLeft();
                } else {
                    if (key > tmp.data) {
                        tmp = tmp.getRight();
                    } else {
                        break;
                    }
                }
            }
        }
        return count / (double) N;
    }
}

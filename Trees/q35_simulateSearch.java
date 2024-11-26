package Trees;

import java.util.Random;
public class q35_simulateSearch {
// WILL NOT BE IN EXAM

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

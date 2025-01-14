package Trees;

import Trees.leafCount;
import java.awt.RenderingHints;

public class q36_accumulate {

    void accumulate(int[] a, int index) {

        if (left != null) {
            left.accumulate(a, index);
        }
        a[index] = data;
        index++;

        if (right != null) {
            right.accumulate(a, index)
        }
    
}

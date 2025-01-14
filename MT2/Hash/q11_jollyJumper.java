
public class q11_jollyJumper {

    /*
A sequence of n > 0 integers is called a jolly jumper if the absolute
 values of the differences between successive elements take on all possible
 values 1 through n- 1. For instance, 1 4 2 3 is a jolly jumper, because
 the absolute differences are 3, 2, and 1, respectively. Write a function
 to determine whether a sequence of numbers is a jolly jumper.
 boolean jollyJumper(int[] sequence)
     */

    public boolean jollyJumper(int[] sequence) {
        int n = sequence.length;

        if (n == 1) {
            return true;
        }
        boolean[] diffs = new boolean[n - 1];

        for (int i = 1; i < n; i++) {
            int diff = Math.abs(sequence[i] - sequence[i - 1]);
            if (diff >= 1 && diff < n) {
                diffs[diff - 1] = true;
            } else {
                return false;
            }
        }
        for (boolean isPresent : diffs) {
            if (!isPresent) {
                return false;
            }
        }
        return true;
    }

}

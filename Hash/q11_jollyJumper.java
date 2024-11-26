
public class q11_jollyJumper {

    public boolean jollyJumper(int[] sequence) {
        int n = sequence.length;

        // If there is only one element, it's trivially a jolly jumper
        if (n == 1) {
            return true;
        }

        // Create an array to track the differences
        boolean[] diffs = new boolean[n - 1];

        // Calculate the absolute differences and mark the corresponding positions in the diffs array
        for (int i = 1; i < n; i++) {
            int diff = Math.abs(sequence[i] - sequence[i - 1]);
            // If the difference is between 1 and n-1, mark it
            if (diff >= 1 && diff < n) {
                diffs[diff - 1] = true;
            } else {
                return false; // Invalid difference, return false
            }
        }

        // Check if all values from 1 to n-1 are covered
        for (boolean isPresent : diffs) {
            if (!isPresent) {
                return false; // If any difference is missing, it's not a jolly jumper
            }
        }

        return true; // All differences are present
    }

}

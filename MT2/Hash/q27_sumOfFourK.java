
public class q27_sumOfFourK {

    public static boolean sumOfFourK(int[] array, int K) {
        Hash hash = new Hash();
        int totalLength = n * (n - 1) / 2;
        int[] tempPairs = new int[totalLength];
        int n = array.length;
        int index = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = array[i] + array[j];
                hash.insert(sum);
                tempPairs[index] = sum;
                index++;
            }
        }

        for (int sum1 : tempPairs) {
            int sum2 = K - sum1;
            if (hash.search(sum2)) {
                return true;
            }
        }

        return false;
    }
}


public class q23_sortByHashing {
// LAST SEMESTER QUESTION

    public static int[] sortByHashing(int[] array) {
        int N = array.length;
        boolean[] hashTable = new boolean[2 * N];
        int[] sortedArray = new int[N];

        for (int value : array) {
            hashTable[value] = true;
        }

        int index = 0;
        for (int i = 0; i < hashTable.length; i++) {
            if (hashTable[i]) {
                sortedArray[index++] = i;
            }
        }

        return sortedArray;
    }

}

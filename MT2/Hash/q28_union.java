
public class q28_union {

    public static int[] union(int[] list1, int[] list2) {

        Hash hash = new Hash();
        int index = 0;

        for (int num : list1) {
            hash.insert(num);
            index++;
        }
        for (int num : list2) {
            if (!hash.search(num)) {
                index++;
            }
        }
        result = new int[index];

        index = 0;
        for (int num : list1) {
            result[index++] = num;
        }
        for (int num : list2) {
            if (!hash.search(num)) {
                hash.insert(num);
                result[index++] = num;
            }
        }
        return result;
    }

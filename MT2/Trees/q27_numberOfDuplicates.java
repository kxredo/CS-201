package Trees;

public class q27_numberOfDuplicates {

    int numberOfDuplicates() {
        int count = 0;
        
        if (left != null) {
            if (left.data == data) {
                count++;
            }
            count += left.numberOfDuplicates();
        }
        if (right != null) {
            if (right.data == data) {
                count++;
            }
            count += right.numberOfDuplicates();
        }
        return count;
    }
}

}

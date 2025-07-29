package Trees;

public class q18_numberOfMeanNodes {

    /*
Write a function which returns the number of mean nodes. A node is a
 mean node if its value is the mean of its left and right children’s values.
 int numberOfMeanNodes()
     */
    int numberOfMeanNodes() {
        int count = 0;
        if (left != null && right != null) {
            if (this.data == (left.data + right.data) / 2) {
                count++;
            }
        }
        if (left != null) {
            count += left.numberOfMeanNodes();
        }
        if (right != null) {
            count += right.numberOfMeanNodes();
        }
        return count;
    }

}


import java.util.Queue;

public class q3_hashFunction {

    public static int hashFunction(Queue k) {
        int sum = 0;
        while (!k.isEmpty()) {
            sum += k.dequeue().getKey();
        }
        return Integer.hashCode(sum);
    }
}

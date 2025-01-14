
public class q4_hashFunction {

    public static int hashFunction(Stack c) {
        int sum = 0;
        while (!c.isEmpty()) {
            sum += c.pop().getKey();
        }
        return Integer.hashCode(sum);
    }
}

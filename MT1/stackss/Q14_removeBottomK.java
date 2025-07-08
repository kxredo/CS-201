/*Write a function which removes only the K bottom elements of the
 stack.
 void removeBottomK(int K)
 */
public class Q14_removeBottomK {

    void removeBottomK(int K) {
        Stack temp = new Stack();
        int count = 0;

        while (!isEmpty()) {
            temp.push(pop());
            count++;
        }
        // Push back only elements above the bottom K
        for (int i = 0; i < count; i++) {
            if (i < K) {
                continue; // Skip bottom K elements
            }
            push(temp.pop());
        }
    }

}

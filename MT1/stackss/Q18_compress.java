package stackss;

public class Q18_compress {

    void compress() {
        Stack temp = new Stack<>();
        Integer last = null;
        // Step 1: Move all items to temp stack (to reverse order)
        while (!this.isEmpty()) {
            temp.push(this.pop());
        }
        // Step 2: Move back to original, skipping duplicates
        while (!temp.isEmpty()) {
            int curr = temp.pop();
            if (last == null || curr != last) {
                this.push(curr);
                last = curr;
            }
        }
    }

}

package stackss;

public class Q8_twoStacks {

    public class TwoStacks {

        private int[] arr; // Array to hold the stacks
        private int size;  // Size of the array
        private int top1;  // Top index for Stack 1
        private int top2;  // Top index for Stack 2

        // Constructor to initialize the stacks
        public TwoStacks(int n) {
            size = n;
            arr = new int[n];
            top1 = -1;        // Stack 1 starts from the beginning
            top2 = n;         // Stack 2 starts from the end
        }

        // Push method for Stack 1
        public void push1(int value) {
            if (top1 + 1 == top2) {
                throw new RuntimeException("Stack Overflow for Stack 1");
            }
            arr[++top1] = value;
        }

        // Push method for Stack 2
        public void push2(int value) {
            if (top2 - 1 == top1) {
                throw new RuntimeException("Stack Overflow for Stack 2");
            }
            arr[--top2] = value;
        }

        // Pop method for Stack 1
        public int pop1() {
            if (top1 == -1) {
                throw new RuntimeException("Stack Underflow for Stack 1");
            }
            return arr[top1--];
        }

        // Pop method for Stack 2
        public int pop2() {
            if (top2 == size) {
                throw new RuntimeException("Stack Underflow for Stack 2");
            }
            return arr[top2++];
        }

        // Check if Stack 1 is empty
        public boolean isEmpty1() {
            return top1 == -1;
        }

        // Check if Stack 2 is empty
        public boolean isEmpty2() {
            return top2 == size;
        }

        // Peek method for Stack 1
        public int peek1() {
            if (top1 == -1) {
                throw new RuntimeException("Stack is empty for Stack 1");
            }
            return arr[top1];
        }

        // Peek method for Stack 2
        public int peek2() {
            if (top2 == size) {
                throw new RuntimeException("Stack is empty for Stack 2");
            }
            return arr[top2];
        }

    }

}

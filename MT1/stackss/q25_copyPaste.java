package stackss;

/*
Write the method for array implementation
 void copyPaste(Stack src, int index)
 which copies all the elements of the src stack and inserts to the stack
 at position index. The bottom element in the stack has index 0 as
 usual. You are not allowed to use pop, push, isEmpty functions. You
 can assume the destination stack has enough space for insertion. Your
 method should run in O(N) time.
 */
public class q25_copyPaste {

    void copyPaste(Stack src, int index) {
        int srcLen = src.size;

        // Shift elements in this stack to make room for src
        for (int i = size - 1; i >= index; i--) {
            dataArray[i + srcLen] = dataArray[i];
        }
        // Copy elements from src stack into this stack at the given index
        for (int i = 0; i < srcLen; i++) {
            dataArray[index + i] = src.dataArray[i];
        }
        size += srcLen;
    }
}

package stackss;

public class Stack {
    Element array[];
    int top;
    int N;
    public Stack(int N) {
        array = new Element[N];
        this.N = N;
        top = -1;
    }
    Element top(){
        return array[top];
    }
    boolean isFull() {
        if(top == N - 1)
            return true;
        else
            return false;
    }
    boolean isEmpty() {
        if(top==-1)
            return true;
        else
            return false;
    }
}


public class Hash {

    Element[] table;
    boolean[] deleted;
    int N;

    public Hash(int N) {
        table = new Element[N];
        deleted = new boolean[N];
        this.N = N;
    
}
}

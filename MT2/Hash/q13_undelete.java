
public class q13_undelete {

    /*
Write a function which undeletes the recently deleted value from the
 hash table. Assume that linear probing is used as the collision strategy.
 void undelete(int value)
     */
    public void undelete(int value) {
        int idx = value % N;
        while (table[idx] != value || !deleted[idx]) {
            idx = (idx + 1) % N;
            // Stop if we've looped all the way around (value not found)
            if (idx == value % N) {
                return;
            }
        }
        // Undelete the value
        deleted[idx] = false;
    }
}

}

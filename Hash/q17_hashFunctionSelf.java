
public class q17_hashFunctionSelf {

    public int hashFunctionItSelf() {
        int sum = 0;

        // Sum up all key values in the hash table
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) {
                sum += table[i].data;  // Assuming table[i].data contains the key value
            }
        }

        return hashFunction(sum);
    }

}

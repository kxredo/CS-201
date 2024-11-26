
public class q19_simplify {

    public HashTable simplify() {
        HashTable newTable = new HashTable(hashTable.length); // Assuming same size

        for (int i = 0; i < hashTable.length; i++) {
            if (hashTable[i] != null) {
                int key = hashTable[i].key;
                boolean inserted = false;
                for (int j = 0; j < newTable.length; j++) {
                    if (newTable[j] != null && newTable[j].key == key) {
                        inserted = true;
                        break;
                    }
                }
                if (!inserted) {
                    newTable.insert(hashTable[i]);
                }
            }
        }

        return newTable;
    }
}

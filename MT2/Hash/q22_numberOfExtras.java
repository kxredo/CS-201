
import javax.swing.text.TableView;

public class q22_numberOfExtras {

    /*
Write a static method in Hash class
 int numberOfExtras(int[] array)
 that takes an array of integers as a parameter and counts the number
 of extra elements in the array. Your method should run in O(N)
 time, where N is the size of the array. Use hashing.
 1 4 2 5 2 4 3 4 →3 extras (two 4, one 2)
 2 1 2 1 2 3 1 2 1 2 →7extras (four 2, three 1)
 1 1 1 1 1 1 →5extras (five 1)
     */
// count
// N is size of array
// value = array[i]
// use hashing (int index = hashFunction(value))
    int numberOfExtras(int[] array) {
        Hash hash = new Hash(array.length);
        int extras = 0;

        for (int i = 0; i < array.length; i++) {
            int index = hash.hashFunction(array[i]);

            while (hash.table[index] != null) {
                if (hash.table[index].getData() == array[i]) {
                    extras++;
                    break;
                }
                index = (index + 1) % N;
            }
            hash.table[index] = new Element(array[i]);
        }
        return extras;
    }

}

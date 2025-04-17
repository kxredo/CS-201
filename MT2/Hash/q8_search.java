
import javax.swing.text.TableView;


public class q8_search {
/*
In open addressing, write a function that searches a key value in the
hash table with quadratic probing as the collision resolution strategy.
Element search(int value)
 */
    public Element search(int value) {

        for(int i = 0;i<table.length;i++)
            if(table[i].getData() == value) {
                return table[i]; // Key found
            }
           
        }
    }

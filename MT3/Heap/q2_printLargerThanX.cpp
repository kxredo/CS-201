package Heap;

public class q2_printLargerThanX {
    
Write a function that prints all nodes in a binary heap larger than a given value X.
 void printLargerThanX(int x)


    void printLargerThanX(int x) {
        for (int i = 0; i < count; i++) { // goes through heap in array until count (number of elements)
            if (array[i].value > x) { // array[i].value > x?
                std::cout << array[i].value << std::endl;
            }
        }
    }

}

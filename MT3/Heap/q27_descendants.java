package MT3.Heap;
/*
 Write a recursive method in MaxDHeap class
 void descendants(int current, int∗ 
list , int& index)
 which fills the descendants of the HeapNode with index current to the
 array list. Use and modify index to store the HeapNodes into correct
 positions. Your method should run in O(N) time.
 */
public class q27_descendants {

    void descendants(int current, int[] list, int[] index) {
        for(int = 1; i <=d; ++i){
            int child = d*current+i;
            if(child >= count){
                continue;
            }
            list[index] = child;
            index++;
            descendants(child, list, index);
        }
    }

    void ascendants(int current, int[] list, int[] index) {
        
        
        // Calculate parent index for d-ary heap
        int parent = (current - 1) / d;
        
        // Add parent to the list
        list[index[0]] = parent;
        index[0]++;
        
        // Recursively find ancestors of the parent
        ascendants(parent, list, index);
    }
}

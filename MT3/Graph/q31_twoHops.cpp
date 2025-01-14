Write the method in linkedlist implementation
 int∗ twoHops(int index)
 which returns the indexes of the nodes which are reachable by two hops,
 that is, it will consist of all indexes j,where one goes from index node
 to nodei , then from node i to node j.The size of the returning array
 should be as much as needed. If there are two or more ways to go to
 a node j, then j must appear that many times in the list(no need to
 sort or check for duplicates).

 #include <cstdlib>

namespace list {

    int* Graph::twoHops(int index, int& size) {
        int* tempResult = new int[vertexCount * vertexCount]; // Temporary array to store results
        size = 0; // Initialize size to 0
        
        Edge* firstHop = edges[index].getHead();
        while (firstHop != nullptr) {
            int intermediateNode = firstHop->getTo();
            Edge* secondHop = edges[intermediateNode].getHead();
            while (secondHop != nullptr) {
                tempResult[size++] = secondHop->getTo();
                secondHop = secondHop->getNext();
            }
            firstHop = firstHop->getNext();
        }
        
        int* result = new int[size]; // Final array of exact size
        for (int i = 0; i < size; ++i) {
            result[i] = tempResult[i];
        }
        
        delete[] tempResult; // Clean up temporary array
        return result;
    }

}
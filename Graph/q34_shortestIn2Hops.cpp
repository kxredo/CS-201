Foradirectedweightedgraph,writethemethodinlinkedlist imple
mentation
 int shortestIn2Hops(int index1, int index2)
 whichreturnstheshortestdistancebetweenthenodes index1andin
dex2bytwohops, that is, itwill returnof theshortestof all paths,
 whereonegoesfromindex1nodetonodei, thenfromnodeitonode
 index2.

 #include <climits>

namespace list {

    int Graph::shortestIn2Hops(int index1, int index2) {
        int minDistance = INT_MAX;
        
        Edge* edge1 = edges[index1].getHead();
        while (edge1 != nullptr) {
            int intermediateNode = edge1->getTo();
            int distance1 = edge1->getWeight();
            
            Edge* edge2 = edges[intermediateNode].getHead();
            while (edge2 != nullptr) {
                if (edge2->getTo() == index2) {
                    int distance2 = edge2->getWeight();
                    int totalDistance = distance1 + distance2;
                    if (totalDistance < minDistance) {
                        minDistance = totalDistance;
                    }
                }
                edge2 = edge2->getNext();
            }
            edge1 = edge1->getNext();
        }
        
        return (minDistance == INT_MAX) ? -1 : minDistance;
    }

}
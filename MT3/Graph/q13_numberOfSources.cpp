A node in a web graph is called a source, if it has no incoming edges.
 Write a method that finds the number of sources in a graph. Write the
 function for both adjacency list and adjacency matrix representations.
 int numberOfSources()
 
int GraphMatrix::numberOfSources() const {
    int count = 0;
    for (int i = 0; i < vertexCount; i++) {
        bool isSource = true;
        for (int j = 0; j < vertexCount; j++) {
            if (edges[j][i] != 0) { //if there is an edge from j to i, it's not a source
                isSource = false;
                break;
            }
        }
        if (isSource) {
            count++;
        }
    }
    return count;
}

int GraphMatrix::numberOfSources() const {
int count = 0;
bool isSource = new bool[vertexCount];
for (int i = 0; i < vertexCount; i++) {
    Edge edge = edges[i].getHead();
    while(edge!=nullptr){
        isSource[edge.getTo()] = true;
        edge = edge->getNext();
    }
    for(int j = 0;j < vertexCount; j++) {
        if(!isSource[j]){
            count++;
        }
    }
}

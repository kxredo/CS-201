


public void merge(int index1, int index2) {
    // Find the roots of both sets
    int root1 = findSetIterative(index1);
    int root2 = findSetIterative(index2);
    
    if (sets[root1].getDepth() < sets[root2].getDepth()) {
        sets[root1].setParent(root2);
    } else {
        sets[root2].setParent(root1);
        
        if (sets[root1].getDepth() == sets[root2].getDepth()) {
            sets[root1].incrementDepth();
        }
    }
}
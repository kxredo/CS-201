/*Write a function that returns the index of a heap node’s grandparent(parent of parent) given its index.
int grandParent(int no)
*/

int grandParent(int no){
    int parent = (no - 1) / 2;
    int grandParent = (parent - 1) / 2;

    return grandParent;

}

int smallest(){
    
    int smallest = array[count / 2].data;
    for(int i = count / 2 + 1; i < count; i++) {
        if(array[i].data < smallest){
            smallest = array[i].data;
        }
        return smallest;
    }

}
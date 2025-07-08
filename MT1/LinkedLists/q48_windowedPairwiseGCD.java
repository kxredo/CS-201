package LinkedLists;
/*
Write a function
 LinkedList windowedPairwiseGCD(int k)
 that computes the GCD (Greatest Common Divisor) of every window of
 k consecutive nodes in the list and returns a new linked list containing
 these GCD values.
 */
public class q48_windowedPairwiseGCD {
    
    // Computes the GCD of every window of k consecutive nodes
    public LinkedList windowedPairwiseGCD(int k) {
        LinkedList result = new LinkedList();
        Node current = head;
        
        while (current != null) {
            int gcd = current.getData();
            Node temp = current;
            
            while(temp!=null){
                for(int i = 1; i < k; i++ ){
                    
                }
}
}

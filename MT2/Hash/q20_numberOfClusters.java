
public class q20_numberOfClusters {
    public int numberOfClusters() {
        int clusters = 0;
        boolean inCluster = false; // Flag to track if we are inside a cluster

        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) {  // If the slot is not null
                if (!inCluster) {  // If it's the start of a new cluster
                    clusters++;
                    inCluster = true; // We're now inside a cluster
                }
            } else {
                inCluster = false; // We're outside a cluster
            }
        }

        return clusters;
    }

}

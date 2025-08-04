package MT3.Graph;

/*
     Given a weighted undirected graph representing the dis
tances between cities in a country, write a method in adjacency matrix
 representation
 int capitalCity ()
 which identifies the index of the capital city. The capital city has the
 largest number of nearby cities compared to other cities. A city A is
 nearby to a city B, if its direct distance to city B is the smallest across
 all cities compared. Identify the number of nearby cities for every city,
 and use one array to store the number of nearby cities for every city.
 */

public int capitalCity() {
        int[] nearbyCitiesCount = new int[vertexCount];
        for (int i = 0; i < vertexCount; i++) {
            for (int j = 0; j < vertexCount; j++) {
                if (edges[i][j] > 0) {
                    nearbyCitiesCount[i]++;
                }
            }
        }
        int maxNearbyCities = -1;
        int capitalCityIndex = -1;
        for (int i = 0; i < vertexCount; i++) {
            if (nearbyCitiesCount[i] > maxNearbyCities) {
                maxNearbyCities = nearbyCitiesCount[i];
                capitalCityIndex = i;
            }
        }
        return capitalCityIndex;
    }

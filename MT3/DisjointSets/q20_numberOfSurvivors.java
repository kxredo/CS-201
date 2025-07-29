/*
    In an unknown world, there are people (zombie) who bites
 other people (may or may not be zombie). One is converted to a zombie,
 if he/she was bitten by some other zombie. Given who bites whom in
 two arrays, identify the number of survivors, that is the number of
 people who hasn’t been bitten yet. Write the static method
 int numberOfSurvivors(int count, int∗ 
whoBites, int∗ 
whoWasBitten, int size)
 where whoBites[i] has bitten whoWasBitten[i] correspondingly. Count
 represents the number of people in the beginning. Size represents the
 size of the arrays whoBites and whoWasBitten. You are only allowed
 to use one external Disjoint Set.
 */


int numberOfSurvivors(int count, int[] whoBites, int[] whoWasBitten, int size) {
        DisjointSet ds = new DisjointSet(count);
        for (int i = 0; i < size; i++) {
            int bitee = whoWasBitten[i];
            int biter = whoBites[i];
            ds.union(biter, bitee);
        }
        boolean[] isZombie = new boolean[count];
        for (int i = 0; i < count; i++) {
            isZombie[ds.findSetIterative(i)] = true;
        }
        int survivors = 0;
        for (boolean zombie : isZombie) {
            if (!zombie) {
                survivors++;
            }
        }
        return survivors;

    }

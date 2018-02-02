package unionFind;

/**
 * Created by hayuxi on 18-2-2.
 */
public class QuickUnion {
    private int[] id;

    /**
     * initialise the id array
     * @param N the size of the array
     */
    public QuickUnion(int N){
        id = new int[N];
        for (int i = 0; i < N; i++) id[i] = i;
    }

    /**
     * find the root of a component
     * @param i component i
     * @return the root of the component p
     */
    public int root(int i){
        while (id[i] != i) i = id[i];

        return i;
    }

    /**
     * checks if two components are connected
     * @param p component p
     * @param q component q
     * @return  true, if p and q are connected; otherwise, false
     */
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    /**
     * join the roots of two components together
     * @param p component p
     * @param q component q
     */
    public void union(int p, int q) {
        int rootP = root(p);
        int rootQ = root(q);

        id[rootP] = rootQ;
    }
}


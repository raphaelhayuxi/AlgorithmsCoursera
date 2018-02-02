package unionFind;

/**
 * Created by hayuxi on 18-2-2.
 */
public class ImprovedQuickUnion {
    private int[] id;
    private int[] sz;

    /**
     * initialise the id array
     * @param N the size of the array
     */
    public ImprovedQuickUnion(int N){
        id = new int[N];
        sz = new int[N];
        for (int i = 0; i < N; i++) id[i] = i;
        for (int i = 0; i < N; i++) sz[i] = 1;
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

        if (rootP == rootQ) return;
        if (sz[rootP] < sz[rootQ]) {id[rootP] = rootQ; sz[rootQ] += sz[rootP];}
        else                       {id[rootQ] = rootP; sz[rootP] += sz[rootQ];}

    }
}


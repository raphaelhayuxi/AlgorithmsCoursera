package unionFind;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by hayuxi on 18-2-2.
 * @author Yuxi Ha
 */
public class UnionFind {
    private int[] parent; // parent[i] = parent of i
    private int count; // number of components

    /**
     * initialise the id array and count
     * @param N number of sites
     */
    public UnionFind(int N){
        if (N < 0) throw new IllegalArgumentException("number of sites must be positive");

        parent = new int[N];
        count = N;

        // each entry of the id array is the same with its index initially
        for (int i =0; i < N; i++) parent[i] = i;
    }



    public int count(){return count;}

    /**
     * find the root of some component
     * @param i component i
     * @return the root of component i
     */
    public int find(int i){
        return 0;
    }

    /**
     * check if two sites are connected
     * @param p site p
     * @param q site q
     * @return true, if p and q are connected; otherwise, false
     */
    public boolean connected(int p, int q){
        return find(p) == find(q);
    }

    /**
     * combines two sites
     * @param p site p
     * @param q site q
     */
    public void union(int p, int q){}

    /**
     * check if p is a valid index
     * @param p
     */
    private void validate(int p) {
        int n = parent.length;

        if (p < 0 || p >= n)
            throw new IllegalArgumentException("index " + p + " is not in the range between 0 and " + (n - 1));
    }

    /**
     * client to read in test cases and output results
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        String[] files = new String[]{"tinyUF.txt","mediumUF.txt","largeUF.txt"};

        Scanner scanner = null;
        for (String s : files){
            try {
                scanner = new Scanner(new File("src/unionFind/TestCase/" + s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            int N = scanner.nextInt();
            UF uf = new UF(N);

            while (scanner.hasNextInt()){
                int p = scanner.nextInt();
                int q = scanner.nextInt();

                if (uf.connected(p, q)) continue;
                uf.union(p, q);
                System.out.println(p + " " + q);
            }

            System.out.println(uf.count() + " components");
        }
    }
}

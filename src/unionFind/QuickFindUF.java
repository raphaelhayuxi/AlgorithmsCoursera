package unionFind;

import java.util.Scanner;

/**
 * Created by rapha on 02/02/2018.
 */
public class QuickFindUF {
    private static int[] id;

    /**
     * initialise the id array
     */
    public QuickFindUF(int N){
        for (int i = 0; i < N; i++){
            id[i] = i;
        }
    }

    /**
     * check if two components have the same id
     */
    public boolean connected(int p, int q){
        if (id[p] == id[q]){
            return true;
        } else {
            return false;
        }

    }

    /**
     * connect two components
     */
    public void union(int p, int q){
        if (!connected(p, q)){
            int pid = id[p];
            int qid = id[q];

            for (int i: id){
                if (id[i] == pid) id[i] = qid;
            }

        }
    }
}

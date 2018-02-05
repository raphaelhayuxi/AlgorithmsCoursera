package BasicProgrammingModel;

public class arrays {
    private int[] a;
    private int n;

    public arrays(int n) {
        a = new int[n];
        for (int i = 0; i < n; i ++) a[i] = 0;
    }

    // find the maximum of the array values
    public int findMax(int[] a) {
        int result = 0;

        for (int i : a)
            if (i > result) result = i;

        return result;
    }

    // compute the average of  the array values
    public int average(int[] a) {
        int total = 0;
        for (int i : a) total += i;

        return total / a.length;
    }

    // copy to another array
    public int[] copy(int[] a) {
        int[] r = new int[a.length];

        for (int i = 0; i < a.length; i ++) r[i] = a[i];

        return r;
    }

    // reverse the elements within an array
    public int[] reverse(int[] a) {
        int[] r = new int[a.length];

        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < a.length; j++) r[i] = a[j];
        }

        return r;
    }

    // matrix-matrix multiplication
    public int[][] multiplication(int[][] m1, int[][] m2) {
        int[][] result = new int[m1.length][m2.length];
        int cell;

        for (int i = 0; i < m1.length; i ++ ){
            for (int j = 0; j < m2.length; j++){
                for (int k = 0; k < m1.length; k++)
                    result[i][j] += m1[i][k] * m2[k][j];
            }
        }

        return result;
    }

    public static void main(String[] args) {









    }
}
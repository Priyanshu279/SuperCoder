import java.util.*;

public class OddIndicesSum {
    public int[] solve(int[] A, int[][] B) {
        int n = A.length;
        int[] prefixOddSum = new int[n];
        prefixOddSum[0] = 0;

        for (int i = 1; i < n; i++) {
            prefixOddSum[i] = prefixOddSum[i - 1];
            if (i % 2 == 1) {
                prefixOddSum[i] += A[i];
            }
        }

        int q = B.length;
        int[] result = new int[q];

        for (int i = 0; i < q; i++) {
            int l = B[i][0];
            int r = B[i][1];
            result[i] = prefixOddSum[r] - (l > 0 ? prefixOddSum[l - 1] : 0);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int q = sc.nextInt();
        int[][] B = new int[q][2];
        for (int i = 0; i < q; i++) {
            B[i][0] = sc.nextInt();
            B[i][1] = sc.nextInt();
        }

        OddIndicesSum obj = new OddIndicesSum();
        int[] result = obj.solve(A, B);

        for (int res : result) {
            System.out.println(res);
        }
        sc.close();
    }
}
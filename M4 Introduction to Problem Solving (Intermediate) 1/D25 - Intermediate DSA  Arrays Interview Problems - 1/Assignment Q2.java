import java.util.*;

class Main {

    // Prefix count array
    public static int[] prefixModifiedCount(int A[]) {
        int N = A.length;
        int pf[] = new int[N];
        int runner = 1;
        for (int i = 0; i < N; i++) {
            if (A[i] == 0) {
                runner = 0;
            }
            pf[i] = runner;
            if (A[i] == 1) {
                runner++;
            }
        }
        return pf;
    }

    // Suffix count array
    public static int[] suffixModifiedCount(int A[]) {
        int N = A.length;
        int sf[] = new int[N];
        int runner = 1;
        for (int i = N - 1; i >= 0; i--) {
            if (A[i] == 0) {
                runner = 0;
            }
            sf[i] = runner;
            if (A[i] == 1) {
                runner++;
            }
        }
        return sf;
    }

    // Main function to calculate the max consecutive ones after at most one swap
    public static int maxConsecutiveOneSwap(int A[]) {
        int N = A.length;

        // Edge case: single element array
        if (N == 1) {
            return A[0];
        }

        // Getting the prefix and suffix count arrays
        int pfCount[] = prefixModifiedCount(A);
        int sfCount[] = suffixModifiedCount(A);
        int ans = 0;

        // Counting number of 1's in the array
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == 1) {
                count++;
            }
        }

        // If there are no 1's, return 0 since no swaps will help
        if (count == 0) {
            return 0;
        }

        // Iterate through the array and check each possible swap
        for (int i = 1; i < N - 1; i++) {
            // If we swap the current 0 with a 1, check the result
            if (A[i] == 0) {
                ans = Math.max(ans, pfCount[i - 1] + 1 + sfCount[i + 1]);
            }
        }

        // Handle edge cases: first and last element swaps
        if (A[0] == 0 && N > 1) {
            ans = Math.max(ans, 0 + 1 + sfCount[1]);
        }
        if (A[N - 1] == 0 && N > 1) {
            ans = Math.max(ans, pfCount[N - 2] + 1 + 0);
        }

        return ans;
    }

    public static void main(String args[]) {
        // Your code goes here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int maxOne = maxConsecutiveOneSwap(A);
        System.out.println(maxOne);
    }
}

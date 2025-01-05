import java.util.*;

class Main {
    public static int smallestSubarrayLengthWithMinAndMax(int[] A) {
        int N = A.length;
        int minElement = Integer.MAX_VALUE;
        int maxElement = Integer.MIN_VALUE;
		
        for (int i = 0; i < N; i++) {
            minElement = Math.min(minElement, A[i]);
            maxElement = Math.max(maxElement, A[i]);
        }

        int minLength = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {

                boolean hasMin = false;
                boolean hasMax = false;

                for (int k = i; k <= j; k++) {
                    if (A[k] == minElement) hasMin = true;
                    if (A[k] == maxElement) hasMax = true;
                }

                if (hasMin && hasMax) {
                    minLength = Math.min(minLength, j - i + 1);
                }
            }
        }
        return minLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int result = smallestSubarrayLengthWithMinAndMax(A);
        System.out.println(result);
    }
}

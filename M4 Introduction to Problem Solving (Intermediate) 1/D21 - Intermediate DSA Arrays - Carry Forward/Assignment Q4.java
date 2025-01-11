import java.util.*;

class Main {
    public static int smallestSubarrayLengthWithMinAndMax(int[] A) {
        int N = A.length;
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;

        int minIndex=-1;
        int maxIndex=-1;
		
        for (int i = 0; i < N; i++) {
            minVal = Math.min(minVal, A[i]);
            maxVal = Math.max(maxVal, A[i]);
        }

        int ansLength = Integer.MAX_VALUE;

        for(int i=N-1;i>=0;i--){
            if(A[i]==minVal){
                minIndex=i;
                if(maxIndex!=-1){
                    ansLength=Math.min(ansLength,maxIndex-minIndex+1);
                }
            }
            else if(A[i]==maxVal){
                maxIndex=i;
                if(minIndex!=-1){
                    ansLength=Math.min(ansLength,minIndex-maxIndex+1);
                }
            }
        }
        return ansLength;
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

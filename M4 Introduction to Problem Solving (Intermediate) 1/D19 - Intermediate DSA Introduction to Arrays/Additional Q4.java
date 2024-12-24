import java.util.*;

class Main {
	public static int[] rangeSumQuery(int A[],int B[][]){
		int N=A.length;
		int M=B.length;
		int sum[]=new int[M];
		
		int prefixSum[]=new int[N+1];
		for(int i=0;i<N;i++){
			prefixSum[i+1]=prefixSum[i]+A[i];
		}
		
		for(int i=0;i<M;i++){
			int start=B[i][0];
			int end=B[i][1];
			sum[i] = prefixSum[end+1] - prefixSum[start];
		}
		return sum;
	}
	
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int A[]=new int[N];
		
		for(int i=0;i<N;i++){
			A[i]=sc.nextInt();
		}
		
		int M=sc.nextInt();
		int B[][]=new int[M][2];
		for(int i=0;i<M;i++){
			for(int j=0;j<2;j++){
				B[i][j]=sc.nextInt();
			}
		}
		
		int result[] = rangeSumQuery(A,B);
		for(int i=0;i<result.length;i++){
			System.out.print(result[i]+" ");
		}
	}
}
import java.util.*;

class Main {
	public static int[] prefixSum(int A[]){
		int sum=A[0];
		for(int i=1;i<A.length;i++){
			sum=sum+A[i];
			A[i]=sum;
		}
		return A;
	}
	
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		int A[]=new int[N];
		
		for(int i=0;i<N;i++){
			A[i]=sc.nextInt();
		}
		
		int result[]=prefixSum(A);
		
		for(int i=0;i<result.length;i++){
			System.out.print(result[i]+" ");
		}
	}
}
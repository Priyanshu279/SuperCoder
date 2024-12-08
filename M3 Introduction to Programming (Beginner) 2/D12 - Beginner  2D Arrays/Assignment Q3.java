import java.util.*;

class Main {
	public static int[] sumRowWise(int A[][]){
		int N=A.length;
		int M=A[0].length;
		
		int ans[]=new int[N];
		
		for(int row=0;row<N;row++){
			int sum=0;
			for(int col=0;col<M;col++){
				sum=sum+A[row][col];
			}
			ans[row]=sum;
		}
		return ans;
	}
	
	public static void main(String args[]){
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
			
		int A[][]=new int[N][M];
		
		for(int row=0;row<N;row++){
			for(int col=0;col<M;col++){
				A[row][col]=sc.nextInt();
			}
		}
			
		int C[]=new int[N];
		C=sumRowWise(A);
			
		for(int i=0;i<N;i++){
			System.out.print(C[i]+" ");
		}
		System.out.println();	
	}
}
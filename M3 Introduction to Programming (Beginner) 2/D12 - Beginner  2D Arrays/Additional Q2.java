import java.util.*;

class Main {
	public static int[][] matrixSubtraction(int A[][],int B[][]){
		int N=A.length;
		int M=A[0].length;
		int resultantMat[][]=new int[N][M];
		
		for(int row=0;row<N;row++){
			for(int col=0;col<M;col++){
				resultantMat[row][col]=A[row][col]-B[row][col];
			}
		}
		return resultantMat;
	}
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int A[][]=new int[N][M];
		int B[][]=new int[N][M];
		
		for(int row=0;row<N;row++){
			for(int col=0;col<M;col++){
				A[row][col]=sc.nextInt();
			}
		}
		
		for(int row=0;row<N;row++){
			for(int col=0;col<M;col++){
				B[row][col]=sc.nextInt();
			}
		}
		
		int ans[][]=matrixSubtraction(A,B);
		
		for(int row=0;row<ans.length;row++){
			for(int col=0;col<ans[0].length;col++){
				System.out.print(ans[row][col]+" ");
			}
			System.out.println();
		}
		
	}
}
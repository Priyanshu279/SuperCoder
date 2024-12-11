import java.util.*;

class Main {
	public static int[][] getTranspose(int A[][]){
		int N=A.length;
		int M=A[0].length;
		int At[][]=new int[M][N];
		for(int row=0;row<N;row++){
			for(int col=0;col<M;col++){
				At[col][row]=A[row][col];
			}
		}
		return At;
	}
		
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int A[][]=new int[N][M];
		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
				A[i][j]=sc.nextInt();
			}
		}
		
		int transpose[][]=getTranspose(A);
		for(int row=0;row<transpose.length;row++){
			for(int col=0;col<transpose[0].length;col++){
				System.out.print(transpose[row][col]+" ");
			}
			System.out.println();
		}
	}
}
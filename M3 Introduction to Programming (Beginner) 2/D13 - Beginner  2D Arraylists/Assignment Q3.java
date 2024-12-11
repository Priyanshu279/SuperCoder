import java.util.*;

class Main {
	public static int[][] matrixAB(int A[][],int B[][]){
		int n1=A.length;// Rows of A
		int m1=A[0].length;// Columns of A
		int n2=B.length;// Rows of B
		int m2=B[0].length;// Columns of B
		
		// Ensure matrix multiplication is valid
        if (m1 != n2) {
            throw new IllegalArgumentException("Matrix multiplication not possible. Columns of A must equal rows of B.");
        }
		
		int result[][]=new int[n1][m2];
		for(int row=0;row<n1;row++){
			for(int col=0;col<m2;col++){
				for(int k=0;k<m1;k++){// Iterate through columns of A and rows of B
					result[row][col] += A[row][k] * B[k][col];
				}
			}
		}
		return result;
	}
		
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		
		int M=sc.nextInt();
		int N=sc.nextInt();
		int P=sc.nextInt();
		
		int A[][]=new int[M][N];
		int B[][]=new int[N][P];
		
		for(int i=0;i<M;i++){
			for(int j=0;j<N;j++){
				A[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<N;i++){
			for(int j=0;j<P;j++){
				B[i][j]=sc.nextInt();
			}
		}
		
		int resultantMatAB[][]=matrixAB(A,B);
		for(int row=0;row<resultantMatAB.length;row++){
			for(int col=0;col<resultantMatAB[0].length;col++){
				System.out.print(resultantMatAB[row][col]+" ");
			}
			System.out.println();
		}
	}
}
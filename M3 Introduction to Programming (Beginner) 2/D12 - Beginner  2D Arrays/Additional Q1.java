import java.util.*;

class Main {
	public static boolean isMatrixABEqual(int A[][],int B[][]){
		int N=A.length;
		for(int row=0;row<N;row++){
			for(int col=0;col<N;col++){
				if(A[row][col]!=B[row][col]){
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int A[][]=new int[N][N];
		int B[][]=new int[N][N];
		
		for(int row=0;row<N;row++){
			for(int col=0;col<N;col++){
				A[row][col]=sc.nextInt();
			}
		}
		
		for(int row=0;row<N;row++){
			for(int col=0;col<N;col++){
				B[row][col]=sc.nextInt();
			}
		}
		
		System.out.println(isMatrixABEqual(A,B));
	}
}
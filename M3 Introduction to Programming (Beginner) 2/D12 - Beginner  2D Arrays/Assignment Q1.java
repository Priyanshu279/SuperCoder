import java.util.*;

class Main {
	public static int[][] sumOfAB(int A[][],int B[][]){
		int N=A.length;
		int M=A[0].length;
		
		int ans[][]=new int[N][M];
		for(int row=0;row<N;row++){
			for(int col=0;col<M;col++){
				ans[row][col]=A[row][col]+B[row][col];
			}
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
			
			int B[][]=new int[N][M];
			
			for(int row=0;row<N;row++){
				for(int col=0;col<M;col++){
					B[row][col]=sc.nextInt();
				}
			}
			
			int C[][]=new int[N][M];
			C=sumOfAB(A,B);
			
			for(int row=0;row<N;row++){
				for(int col=0;col<M;col++){
					System.out.print(C[row][col]+" ");
				}
				System.out.println();
			}
		}
	}
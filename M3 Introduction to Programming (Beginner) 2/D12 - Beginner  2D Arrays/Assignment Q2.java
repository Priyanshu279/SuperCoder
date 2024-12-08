import java.util.*;

class Main {
	public static void waveRowWise(int A[][]){
		int N=A[0].length;
		for(int row=0;row<N;row++){
			if(row%2==0){
				for(int col=0;col<N;col++){
					System.out.print(A[row][col]+" ");
				}
			}
			else{
				for(int col=N-1;col>=0;col--){
					System.out.print(A[row][col]+" ");
				}
			}
		}
	}
	
	public static void main(String args[]){
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
			
		int A[][]=new int[N][N];
		
		for(int row=0;row<N;row++){
			for(int col=0;col<N;col++){
				A[row][col]=sc.nextInt();
			}
		}
		waveRowWise(A);
	}
}
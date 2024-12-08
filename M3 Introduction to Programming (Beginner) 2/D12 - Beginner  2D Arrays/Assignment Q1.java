import java.util.*;

class Main {
	public static void waveColWise(int A[][]){
		int N=A[0].length;
		for(int col=0;col<N;col++){
			if(col%2==0){
				for(int row=0;row<N;row++){
					System.out.print(A[row][col]+" ");
				}
			}
			else{
				for(int row=N-1;row>=0;row--){
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
		waveColWise(A);
	}
}
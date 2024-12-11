import java.util.*;

class Main {
	public static int checkIdentityMatrix(int A[][]){
		int N=A.length;
		int ans=1;
		for(int row=0;row<N;row++){
			for(int col=0;col<N;col++){
				if(row==col && A[row][col]!=1){
					ans=0;
				}
				if(row!=col && A[row][col]!=0){
					ans=0;
				}
			}
		}
		return ans;
	}
		
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int A[][]=new int[N][N];
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				A[i][j]=sc.nextInt();
			}
		}
		System.out.println(checkIdentityMatrix(A));
	}
}
import java.util.*;

class Main {
	public static int[] maxOfEachRow(int A[][]){
		int N=A.length;
		int M=A[0].length;
		int arr[]=new int[N];
		
		for(int row=0;row<N;row++){
			int max=A[row][0];
			for(int col=0;col<M;col++){
				if(A[row][col]>max){
					max=A[row][col];
				}
			}
			arr[row]=max;
		}
		return arr;
	}
	
	public static void main(String args[]) {
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
		
		int arr[]=maxOfEachRow(A);
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
	}
}
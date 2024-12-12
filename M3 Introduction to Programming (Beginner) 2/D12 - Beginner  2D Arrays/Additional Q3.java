import java.util.*;

class Main {
	public static int[] sumOfCol(int C[][]){
		int A=C.length;
		int B=C[0].length;
		int arr[]=new int[B];
		
		for(int col=0;col<B;col++){
			int sum=0;
			for(int row=0;row<A;row++){
				sum=sum+C[row][col];
			}
			arr[col]=sum;
		}
		return arr;
	}
	
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C[][]=new int[A][B];
		
		for(int row=0;row<A;row++){
			for(int col=0;col<B;col++){
				C[row][col]=sc.nextInt();
			}
		}
		
		int arr[]=sumOfCol(C);
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
	}
}
import java.util.*;

class Main {
	public static void printRevArray(int arr[]){
		int n=arr.length;
		for(int i=n-1;i>=0;i--){
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int A[]=new int[n];
		
		for(int i=0;i<n;i++){
			A[i]=sc.nextInt();
		}
		printRevArray(A);
	}
}
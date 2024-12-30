import java.util.*;

class Main {
	public static int[] product(int arr[]){
		int prod[]=prefixProduct(arr);
		int n=prod.length;
		int ans[]=new int[arr.length];
		
		for(int i=0;i<n;i++){
			ans[i]=prod[n-1]/arr[i];
		}
		return ans;
	} 
	
	public static int[] prefixProduct(int arr[]){
		int n=arr.length;
		int pfxProd[]=new int[n];
		pfxProd[0]=arr[0];
		
		for(int i=1;i<n;i++){
			pfxProd[i]=pfxProd[i-1]*arr[i];
		}
		return pfxProd;
	}
	
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int A[]=new int[N];
		
		for(int i=0;i<N;i++){
			A[i]=sc.nextInt();	
		}
		
		int prod[]=product(A);
		
		for(int i=0;i<prod.length;i++){
			System.out.print(prod[i]+" ");
		}
		
	}
}